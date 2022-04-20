package com.client.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.client.models.Clientes;


@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Integer>{
	
}
