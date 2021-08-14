package br.com.multitenancydiscriminator.controllers;

import br.com.multitenancydiscriminator.models.Evento;
import br.com.multitenancydiscriminator.repositories.EventoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */

@RestController
@RequestMapping("evento")
public class EventoController {

  private final EventoRepository eventoRepository;

  public EventoController(EventoRepository eventoRepository){
    this.eventoRepository = eventoRepository;
  }

  @GetMapping
  public ResponseEntity<List<Evento>> getEventos(){
    List<Evento> eventos = eventoRepository.findAll();
    return ResponseEntity.ok(eventos);
  }
}
