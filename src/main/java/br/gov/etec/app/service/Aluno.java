package br.gov.etec.app.service;

import java.util.List;

import br.gov.etec.app.dtos.AlunoDto;
import br.gov.etec.app.entity.AlunoEntity;

public interface Aluno {
	
	public Boolean validarAluno(AlunoDto dto);
	
	public void salvarAluno(AlunoEntity entity);
	
	public List<AlunoEntity> listarAlunos();

	public Object logarAluno(String email, String senha);
	
}
