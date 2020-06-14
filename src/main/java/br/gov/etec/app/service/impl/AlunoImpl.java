package br.gov.etec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.etec.app.dtos.AlunoDto;
import br.gov.etec.app.entity.AlunoEntity;
import br.gov.etec.app.repository.AlunoRepository;
import br.gov.etec.app.service.Aluno;

/*
 * Implementa o interface de aluno
 */

@Service
public class AlunoImpl implements Aluno {
	
	/*
	 * Injeção do repositorio BD
	 */
	@Autowired
	private AlunoRepository repository;
	
	/*
	 * Implementa validarAluno
	 */
	public Boolean validarAluno (AlunoDto aluno) {
		// regra de negócio
		if ( aluno != null) {	// se aluno não existe
			 return true;
		} else {
			return false;
		}
			
	}
	
	public void salvarAluno(AlunoEntity entity) {
		repository.save(entity);
		
	}
	
	public List<AlunoEntity> listarAlunos () {
		return repository.findAll();
	}
	
	public Object logarAluno(String email, String senha) {
		return repository.findByEmailAndSenha(email, senha);
	}
		
}
