package com.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.models.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario save(Usuario usuario);
	void deleteById(Long id);
	Usuario updateUser(Long id, Usuario usuario);
}
