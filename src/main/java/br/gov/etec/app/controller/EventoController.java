package br.gov.etec.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.dtos.EventoDto;
import br.gov.etec.app.entity.EventoEntity;
import br.gov.etec.app.mapping.EventoMapping;
import br.gov.etec.app.service.Evento;

@RestController
@RequestMapping("/evento")
public class EventoController {
	/*
	 * O Service é injetado e ele por sua vez chama o repository
	 */
	@Autowired
	private Evento service;
	private static final Logger log = LoggerFactory.getLogger(CursoController.class);
	
	@PostMapping("/cadastrar") 
	public void cadastrarEvento (@RequestBody EventoDto dto ){
		if (service.validarEvento(dto)) {
			// service.salvarEvento(this.fromDtoEntity(dto));
			EventoEntity entity = EventoMapping.fromEntity(dto);
			service.salvarEvento(entity);
		} else {
			log.info("status = 0, evento invalido!!");
		}
			
		
	}
	
	
	@GetMapping("/listar")
	public List<EventoEntity> listarEventos (){
		return service.listaEventos();
	} 

}