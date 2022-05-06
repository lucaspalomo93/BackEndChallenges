package com.mvc.crud.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.crud.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
	Page<Usuario> findAll(Pageable cantidad);
}
