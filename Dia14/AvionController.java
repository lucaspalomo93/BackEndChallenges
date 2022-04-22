package com.aviones.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.aviones.models.AvionModel;
import com.aviones.services.AvionesService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/aviones")
@Api(value = "Controller de aviones")
public class AvionController {

	@Autowired
	private AvionesService aService;
	

	@GetMapping
	public ResponseEntity<List<AvionModel>> findAll(){
		return new ResponseEntity<>(aService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{matricula}")
	public ResponseEntity<AvionesService> findById(@PathVariable String matricula) {
		List<String> matriculas = new ArrayList();
		
		List<AvionModel> aviones = aService.findAll();
		
		aviones.forEach(avion ->{
			if(avion.getMatricula().equals(matricula)) {
				matriculas.add(avion.getMatricula());
			}
		});
	
		if(!matriculas.isEmpty()) {
			return new ResponseEntity(aService.findById(matricula), HttpStatus.OK);
		}else {
			
			return new ResponseEntity("No se ha encontrado", HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping
	public void save(@RequestBody AvionModel avion) {
		aService.save(avion);
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody AvionModel avion) {
		List<String> matriculas = new ArrayList();
		
		List<AvionModel> aviones = aService.findAll();
		
		aviones.forEach(avionL ->{
			if(avionL.getMatricula().equals(avion.getMatricula())) {
				matriculas.add(avionL.getMatricula());
			}
		});
	
		if(!matriculas.isEmpty()) {
			aService.save(avion);
			return new ResponseEntity("Usuario actualizado", HttpStatus.OK);
		}else {
			
			return new ResponseEntity("No se ha podido actualizar", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{matricula}")
	public ResponseEntity<String> delete(@PathVariable String matricula) {
		List<String> matriculas = new ArrayList();
		
		List<AvionModel> aviones = aService.findAll();
		
		aviones.forEach(avionL ->{
			if(avionL.getMatricula().equals(matricula)) {
				matriculas.add(avionL.getMatricula());
			}
		});
	
		if(!matriculas.isEmpty()) {
			aService.deleteById(matricula);
			return new ResponseEntity("Usuario Eliminado", HttpStatus.OK);
		}else {
			
			return new ResponseEntity("No se ha podido eliminar", HttpStatus.NOT_FOUND);
		}
	}
}
