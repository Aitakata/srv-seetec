package br.gov.etec.app.mapping;

import br.gov.etec.app.dtos.AlunoDto;
import br.gov.etec.app.entity.AlunoEntity;
/*
 * Mapeamento Entidade <-> Dto
 */
public class AlunoMapping {
	public static AlunoEntity fromEntity (AlunoDto dto) {
		AlunoEntity entity = new AlunoEntity();
		entity.setNome(dto.getNome());
		entity.setRg(dto.getRg());
		entity.setCpf(dto.getCpf());
		entity.setEmail(dto.getEmail());
		entity.setId_curso(dto.getId_curso());
		entity.setData_nasc(dto.getData_nasc());
		entity.setSenha(dto.getSenha());
		return entity;
	}

	public static AlunoDto fromEntity (AlunoEntity entity) {
		AlunoDto dto = new AlunoDto();
		return dto;
	}

}
