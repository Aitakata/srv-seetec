package br.gov.etec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.etec.app.dtos.CursoDto;
import br.gov.etec.app.entity.CursoEntity;
import br.gov.etec.app.repository.CursoRepository;
import br.gov.etec.app.service.Curso;

/*
 * Implements a interface de Curso
 */
@Service
public class CursoImpl implements Curso {
	/*
	 * Injeção do repositorio BD 
	 */
	@Autowired
	private CursoRepository repository;
	
	/* 
	 *  Implements o método para validar o Curso
	 */
	public Boolean validarCurso(CursoDto curso) {
		// Regra de negócio
		if (curso != null ) {
			return true;
		} else {
			return false;
		}
 	}
	
	/*
	 *  Implements o método Salvar Curso que chama o BD
	 */
	public void salvarCurso(CursoEntity entity) {
		repository.save(entity);
		
	}
	
	/*
	 * Implements o método de consulta de cursos
	 */
	
	public List<CursoEntity> listarCursos () {
		return repository.findAll();
	}

}
