package com.aticma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aticma.model.Persona;

@Controller
@RequestMapping("/personas")
public class PersonaController {
	

	
	@GetMapping
	public String index(Model model) {
		Persona p1 = new Persona("Lucas","Palomo",28);
		Persona p2 = new Persona("Sebastian","Chamorro",28);
		Persona p3 = new Persona("Nahuel","Ramon",19);
		Persona p4 = new Persona("Marcos","Bracciale",28);
		Persona p5 = new Persona("Juan Manuel","Mujica",25);
		Persona p6 = new Persona("Leonel","Grigoriadis",19);
		
		List<Persona> personas = new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		personas.add(p6);
		
		model.addAttribute("titulo", "Personas");
		model.addAttribute("personas", personas);
		
		return "personas";
	}
}
