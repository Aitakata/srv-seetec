package br.gov.etec.app.service;

import java.util.List;

import br.gov.etec.app.dtos.CursoDto;
import br.gov.etec.app.entity.CursoEntity;
/*
 * Regras de negócio
 */
public interface Curso {
	
	public Boolean validarCurso(CursoDto dto);
	
	public void salvarCurso(CursoEntity entity);
	
	public List<CursoEntity> listarCursos();

}
