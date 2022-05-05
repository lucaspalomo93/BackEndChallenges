package com.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.models.Cliente;
import com.api.repositories.IClienteRepository;

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
		return cRepository.findById(id);
	}

	@Override
	public void save(Cliente cliente) {
		cRepository.save(cliente);		
	}

	@Override
	public void deleteById(Long id) {
		cRepository.deleteById(id);
	}
}
