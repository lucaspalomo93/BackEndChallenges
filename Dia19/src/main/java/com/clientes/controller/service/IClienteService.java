package com.clientes.controller.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.clientes.controller.repository.IClienteRepository;
import com.clientes.models.Cliente;

@Service
public interface IClienteService extends IClienteRepository{
	List<Cliente> findAll();
	Cliente save(Cliente cliente);
}
