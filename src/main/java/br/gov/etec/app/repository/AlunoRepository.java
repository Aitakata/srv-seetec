package br.gov.etec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.etec.app.entity.AlunoEntity;

public interface AlunoRepository extends JpaRepository <AlunoEntity, Long> {
	
	AlunoEntity findByEmailAndSenha(String email, String senha);

}
