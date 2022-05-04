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

import com.curso.mvc.models.Especialidad;
import com.curso.mvc.services.EspecialidadServiceImpl;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
	
	@Autowired
	private EspecialidadServiceImpl eService;
	
	@GetMapping
	public List<Especialidad> findAll(){
		return eService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Especialidad> getOne(@PathVariable String id) {
		return eService.findById(id);
	}
	
	@PostMapping
	public Especialidad save(Especialidad especialidad) {
		return eService.save(especialidad);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		eService.deleteById(id);
	}
}
