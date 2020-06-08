package br.gov.etec.app.mapping;

import br.gov.etec.app.dtos.EventoDto;
import br.gov.etec.app.entity.EventoEntity;

public class EventoMapping {
	public static EventoEntity fromEntity (EventoDto dto) {
		EventoEntity entity = new EventoEntity();
		entity.setNome(dto.getNome());
		entity.setDescricao(dto.getDescricao());
		entity.setStatus(dto.getStatus());
		entity.setDataInicio(dto.getDataInicio());
		entity.setDataFim(dto.getDataFim());
		return entity;
	}

	public static EventoDto fromEntity (EventoEntity entity) {
		EventoDto dto = new EventoDto();
		return dto;
	}
}
