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

import br.gov.etec.app.dtos.CursoDto;
import br.gov.etec.app.entity.CursoEntity;
import br.gov.etec.app.mapping.CursoMapping;
import br.gov.etec.app.service.Curso;

@RestController
@RequestMapping("/curso")
public class CursoController {
	/* 
	 * O service é injetado e ele por sua vez chama o repository
	 */
	@Autowired
	private Curso service;
	private static final Logger log = LoggerFactory.getLogger(CursoController.class);
	
	
	@PostMapping
	@RequestMapping("/cadastrar")
	public void cadastrarCurso(@RequestBody CursoDto dto) {		
		if (service.validarCurso(dto)) {
			CursoEntity entity = CursoMapping.fromEntity(dto);		
			service.salvarCurso(entity);}
		else {
			log.info("status = 0, Curso Invalido!");
		};
	}
	
	@GetMapping("/listar")
	public List<CursoEntity> listarCursos(){		
		log.info("listando todos cursos da base de dados");
		/* 
		List<Curso> cursos = repository.findAll();		
		for (Curso curso : cursos) {
			log.debug("Curso: " ,curso.toString());
		}		
		return cursos;
		*/
		return service.listarCursos();
	}	
}
