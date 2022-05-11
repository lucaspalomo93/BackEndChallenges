package com.pair.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pair.models.Rol;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Long>{

	public Optional<Rol> findByNombre(String nombre);
}
