package com.ventas.mercado.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ventas.mercado.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
	Boolean existsByEmail(String email);
	Boolean existsByPassword(String password);
}
