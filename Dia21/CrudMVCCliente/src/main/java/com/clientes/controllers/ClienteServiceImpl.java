package com.clientes.controllers;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clientes.models.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository cRepository;

	@Override
	public List<Cliente> findAll() {
		return cRepository.findAll();
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		if(cRepository.existsById(id)) {
			return cRepository.findById(id);
		}
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		if(cliente != null) {
			return cRepository.save(cliente);
		}
		return null;
	}

	@Override
	public Cliente updateCliente(Long id, Cliente cliente) {
		if(cRepository.existsById(id)) {
			if(cliente != null) {
				return cRepository.save(cliente);
			}
		}
		return null;
	}

	@Override
	public void deleteById(Long id) {
		if(cRepository.existsById(id)) {
			cRepository.deleteById(id);
		}
	}
	

}
