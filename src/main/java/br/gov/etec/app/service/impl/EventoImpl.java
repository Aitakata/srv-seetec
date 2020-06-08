package br.gov.etec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.etec.app.dtos.EventoDto;
import br.gov.etec.app.entity.EventoEntity;
import br.gov.etec.app.repository.EventoRepository;
import br.gov.etec.app.service.Evento;

/* 
 * Implementa a interface de evento 
*/

@Service
public class EventoImpl implements Evento {
	
	/* Injeçao da repository BD onde salvamos 
	 *  0 = Evento Inativo (não mostrar) 1= Ativo (apresentar) 
	*/
	@Autowired
	private EventoRepository repository;
	
	/* 
	 *  implementamos o método para validar o Evento como ativo
	*/
	@Override
	public Boolean validarEvento(EventoDto evento) {
		// Regra de negócio
		if (evento.getStatus() == 1 ) {
			return true;
		};
			return false;
 	}
	
	// implementa o método Salvar Evento que chama o BD
	public void salvarEvento(EventoEntity entity) {
		repository.save(entity);
		
	}
	
	/*
	 * Implementa o método de consulta de eventos
	 */
	public List<EventoEntity> listaEventos () {
		return repository.findAll();
	}
}
