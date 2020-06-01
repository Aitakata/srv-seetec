package br.gov.etec.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.dtos.AlunoDto;
import br.gov.etec.app.entity.Aluno;
import br.gov.etec.app.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	private static final Logger Log = LoggerFactory.getLogger(AlunoController.class);
	
	@GetMapping("/listar")
	public List<Aluno> listarAlunos (){
		Log.info("listando todos alunos do cursos");	
		return repository.findAll();
	} 
	
	@GetMapping("/id")
	public Object listarAluno(@PathVariable("id") Long id){
		Log.info("listando um aluno"+id);
				return repository.findById(id);
	} 
	
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody AlunoDto dto) {
		Aluno aluno = this.toDtoEntity(dto);
		repository.save(aluno);
	}
	
	@PostMapping("/logar")
	public Object alunoLogin(@RequestBody AlunoDto alunodto) {
		return repository.findByEmailAndSenha(alunodto.getEmail(), alunodto.getSenha());
	}
	
	private Aluno toDtoEntity(AlunoDto dto) {
		Log.info("Cadastro do", dto.toString());
		Log.debug("Cadastro do", dto.toString());
		Aluno a = new Aluno();
		a.setNome(dto.getNome());
		a.setRg(dto.getRg());
		a.setCpf(dto.getCpf());
		a.setEmail(dto.getEmail());
		a.setId_curso(dto.getId_curso());
		a.setData_nasc(dto.getData_nasc());
		a.setSenha(dto.getSenha());
		return a;
	}

}
