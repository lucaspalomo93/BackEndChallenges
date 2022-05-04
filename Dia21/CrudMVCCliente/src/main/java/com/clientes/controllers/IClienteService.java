package com.clientes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.clientes.models.Cliente;

@Service
public interface IClienteService{
	public List<Cliente> findAll();
	public Optional<Cliente> findById(Long id);
	public Cliente save(Cliente cliente);
	public Cliente updateCliente(Long id, Cliente cliente);
	public void deleteById(Long id);	
}
