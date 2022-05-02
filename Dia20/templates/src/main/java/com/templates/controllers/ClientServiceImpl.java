package com.templates.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.templates.models.Client;

@Service
public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClientRepository cRepository;
	
	@Override
	public List<Client> findAll() {
		return cRepository.findAll();
	}

	@Override
	public Optional<Client> findById(Long id) {
		if(cRepository.existsById(id)) {
			return cRepository.findById(id);
		}
		return null;
	}

	@Override
	public Client save(Client user) {
		if(!user.getName().isEmpty() && !user.getSurname().isEmpty() && !user.getAdress().isEmpty()) {
			return cRepository.save(user);
		}
		return null;
	}

	@Override
	public int deleteById(Long id) {
		if(cRepository.existsById(id)) {
			cRepository.deleteById(id);
			return 1;
		}
		return 0;
	}

}
