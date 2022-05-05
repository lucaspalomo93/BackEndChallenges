package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.models.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long>{
	public boolean existsByDni(int dni);
}
