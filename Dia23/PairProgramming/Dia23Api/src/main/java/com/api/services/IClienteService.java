package com.api.services;

import java.util.List;
import java.util.Optional;

import com.api.models.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Optional<Cliente> findById(Long id);
	public void save(Cliente cliente);
	public void deleteById(Long id); 
	public Cliente update(Long id, Cliente cliente);
}
