package com.crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.models.Usuario;
import com.crud.service.UsuarioServiceImp;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioServiceImp uService;
	
	@GetMapping
	public List<Usuario> getAllUsers(){
		return uService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Usuario>> getOneUser(@PathVariable Long id) {
		
		if(uService.findById(id) != null) {
			return ResponseEntity.ok().body(uService.findById(id));
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> updateUser(@PathVariable Long id, @RequestBody Usuario usuario) {
		if(uService.updateUser(id, usuario) != null) {
			return ResponseEntity.ok().body(uService.updateUser(id, usuario));
		}
		return ResponseEntity.badRequest().build();

	}
}
