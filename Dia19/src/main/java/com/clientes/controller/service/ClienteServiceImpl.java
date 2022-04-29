package com.clientes.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientes.models.Cliente;

@Service
public class ClienteServiceImpl{
	@Autowired
	private IClienteService iService;
	
	public List<Cliente> findAll(){
		return iService.findAll();
	}
	
	public Cliente save(Cliente cliente) {
		return iService.save(cliente);
	}
}
