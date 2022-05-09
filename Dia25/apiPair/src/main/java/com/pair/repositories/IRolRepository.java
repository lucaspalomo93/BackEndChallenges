package com.pair.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pair.models.Roles;

public interface IRolRepository extends JpaRepository<Roles, Long>{
	Roles findByNombreRol(String rol);
}
