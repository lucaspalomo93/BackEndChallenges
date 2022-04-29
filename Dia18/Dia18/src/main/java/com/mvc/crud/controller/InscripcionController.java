package com.mvc.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.crud.model.Inscripcion;
import com.mvc.crud.service.EstudianteService;
import com.mvc.crud.service.InscripcionService;
import com.mvc.crud.service.MateriaService;

@Controller
@RequestMapping("/inscripciones")
public class InscripcionController {
	
	@Autowired
	private EstudianteService eService;
	
	@Autowired
	private InscripcionService iService;
	
	@Autowired
	private MateriaService mService;

	@GetMapping
	public List<Inscripcion> getAllInscripciones(){
		return iService.findAll();
	}
	
}
