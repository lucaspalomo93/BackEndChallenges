package com.mvc.registro.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.registro.models.Persona;
import com.mvc.registro.service.PersonaService;

@Controller
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private PersonaService pService;
	
	@GetMapping("/listar")
	public String listarPersonas(Model model) {
		
		model.addAttribute("titulo", "Listado de Personas");
		model.addAttribute("personas", pService.findAll());
				
		return "listar";
	}
	
	@GetMapping("/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@PostMapping("/formulario")
	public String insertarPersona(Persona persona) {
		
		pService.save(persona);
		
		return "redirect:listar";
	}
	
}
