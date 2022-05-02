package com.templates.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.templates.models.Client;


@Service
public interface IClientService {
	public List<Client> findAll();
	public Optional<Client> findById(Long id);
	public Client save(Client user);
	public int deleteById(Long id);
	
}
