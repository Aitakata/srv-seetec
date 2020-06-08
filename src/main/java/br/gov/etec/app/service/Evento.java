package br.gov.etec.app.service;

import java.util.List;

import br.gov.etec.app.dtos.EventoDto;
import br.gov.etec.app.entity.EventoEntity;

/* 
 * Na camada service, normalmente definimos as regras de negocios 
 */
public interface Evento {
	
	public Boolean validarEvento(EventoDto dto);
	
	public void salvarEvento(EventoEntity entity);
	
	public List<EventoEntity> listaEventos();

}
