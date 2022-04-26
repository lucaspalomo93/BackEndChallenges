package com.crud.lecture.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.crud.lecture.model.Animal;
import com.crud.lecture.repository.IAnimalRepository;

@RestController
@RequestMapping("/api")
public class AnimalController {
	
	@Autowired
	private IAnimalRepository aRepository;
	
	@GetMapping("/animales")
	public ResponseEntity<List<Animal>> findAllAnimals(){
		return ResponseEntity.ok().body(aRepository.findAll());
	}
	
	@PostMapping("/nuevoAnimal")
	public ResponseEntity<Animal> addAnimal(@RequestBody Animal animal){
		return ResponseEntity.ok().body(aRepository.save(animal));
	}

	@GetMapping("/animal/{id}")
	public ResponseEntity<Optional<Animal>> getAnimal(@PathVariable Long id){
		return ResponseEntity.ok().body(aRepository.findById(id));
	}
	
	@PutMapping("/animal/{id}")
	public ResponseEntity<String> updateAnimal(@PathVariable Long id, @RequestBody Animal animal){
		
		return aRepository.findById(id).map(nuevoAnimal ->{
			nuevoAnimal.setRaza(animal.getRaza());
			nuevoAnimal.setEdad(animal.getEdad());
			aRepository.save(nuevoAnimal);
			return ResponseEntity.ok().body("Usuario actualizado");
		})
		.orElseGet(()->{
			return ResponseEntity.badRequest().body("No actulizado");
		});			
	}
	
	@DeleteMapping("/animal/{id}")
	public ResponseEntity<String> deleteAnimal(@PathVariable Long id){
		aRepository.deleteById(id);
		return ResponseEntity.ok().body("Animal eliminado");
	}
}
