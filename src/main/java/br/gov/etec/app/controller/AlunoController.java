package br.gov.etec.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.dtos.AlunoDto;
import br.gov.etec.app.entity.AlunoEntity;
import br.gov.etec.app.mapping.AlunoMapping;
import br.gov.etec.app.service.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	/* 
	 * O service (Aluno) é injetado e ele por sua vez injeta o repositorio 
	 */
	@Autowired
	private Aluno service;
	private static final Logger log = LoggerFactory.getLogger(AlunoController.class);
		
	@PostMapping("/cadastrar")
	public void cadastrarAluno (@RequestBody AlunoDto dto) {
		if (service.validarAluno(dto)) {
		AlunoEntity entity = AlunoMapping.fromEntity(dto);
		service.salvarAluno(entity);}
		else {
			log.info("status = 0, Aluno Invalido!!");
		};
	}
	
	@GetMapping("/listar")
	public List<AlunoEntity> listarAlunos (){
		log.info("listando todos alunos do cursos");	
		return service.listarAlunos();
	} 
	
	@PostMapping("/logar")
	public Object logarAluno(@RequestBody AlunoDto alunodto) {
		return service.logarAluno(alunodto.getEmail(), alunodto.getSenha());
	}
	

}
