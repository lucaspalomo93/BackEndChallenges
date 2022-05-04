package com.clientes.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientes.models.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
