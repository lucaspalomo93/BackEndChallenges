package com.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Cliente;
import com.api.services.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private IClienteService cService;
	
	@GetMapping
	public List<Cliente> getAll(){
		return cService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> findOne(@PathVariable Long id) {
		return cService.findById(id);
	}
	
	@PostMapping
	public void save(@RequestBody Cliente cliente) {
		cService.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		cService.deleteById(id);
	}
}
