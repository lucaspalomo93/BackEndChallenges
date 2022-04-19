package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Cancion;


@Controller
@RequestMapping("/app")
public class CancionesController {

	
	@GetMapping("/spotify")
	public String mostrarCanciones(Model model) {
		
		model.addAttribute("titulo", "Spotify");
		
		return "canciones";
	}
	
	@GetMapping("/listar")
	public String listarCanciones(Model model) {
		List<Cancion> canciones = new ArrayList<>();
		/*
		canciones.add(new Cancion("Vamos las bandas", 5));
		canciones.add(new Cancion("Bohemian Rhapsody", 8));
		canciones.add(new Cancion("You", 2));
		*/
		
		model.addAttribute("canciones", canciones);
		return "listar";
	}
	
	
	
	

}
