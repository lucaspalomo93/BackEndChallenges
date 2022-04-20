package com.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.client.models.Clientes;
import com.client.repository.ClientesRepository;

@RestController
@RequestMapping("/v1/clientes")
public class ClientesController {

	@Autowired
	private ClientesRepository cRepository;
	
	@GetMapping
	public List<Clientes> findAll(){
		return (List<Clientes>) cRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Clientes> findById(@PathVariable Integer id) {
		return  cRepository.findById(id);
	}
	
	@PostMapping
	public void addCliente(@RequestBody Clientes cliente) {
		cRepository.save(cliente);
	}
	
	@PutMapping
	public void updateCliente(@RequestBody Clientes cliente) {
		cRepository.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Integer id) {
		cRepository.deleteById(id);
	}
	
}
