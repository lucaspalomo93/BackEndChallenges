package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Cancion;

@RestController
@RequestMapping("/api")
public class CancionesRestController {

	
	@GetMapping("/listarCanciones")
	public String listarCanciones() {
		return "mostrando canciones";
	}
	
	@GetMapping("/listarPorId/{id}")
	public String listarPorID(@PathVariable int id) {
		return "Listando por id: " + id;
	}
	
	@PostMapping("/insertarCancion")
	public Cancion insertarCancion(@RequestBody String nombre) {
		return new Cancion(nombre);
	}
	
	@PutMapping("/actualizarCancion")
	public String actualizandoCancion() {
		return "Actualizando cancion";
	}
	
}
