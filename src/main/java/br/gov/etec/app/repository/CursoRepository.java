package br.gov.etec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.etec.app.entity.CursoEntity;

public interface CursoRepository  extends JpaRepository<CursoEntity, Long>{

}
