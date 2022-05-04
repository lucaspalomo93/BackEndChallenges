package com.curso.mvc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.mvc.models.Turno;
import com.curso.mvc.services.TurnosServiceImpl;

@RestController
@RequestMapping("/turnos")
public class TurnosController {

	
	@Autowired
	private TurnosServiceImpl tService;
	
	@GetMapping
	public List<Turno> findAll(){
		return tService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Turno> getOne(@PathVariable Long id) {
		return tService.findById(id);
	}
	
	@PostMapping
	public Turno save(Turno Turnos) {
		return tService.save(Turnos);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		tService.deleteById(id);
	}
}
