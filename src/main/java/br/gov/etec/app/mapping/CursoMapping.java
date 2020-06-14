package br.gov.etec.app.mapping;

import br.gov.etec.app.dtos.CursoDto;
import br.gov.etec.app.entity.CursoEntity;

public class CursoMapping {
	public static CursoEntity fromEntity (CursoDto dto) {
		CursoEntity entity = new CursoEntity();
		entity.setNome(dto.getNome());
		entity.setDescricao(dto.getDescricao());
		return entity;
	}

	public static CursoDto fromEntity (CursoEntity entity) {
		CursoDto dto = new CursoDto();
		return dto;
	}

}
