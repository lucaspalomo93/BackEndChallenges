package com.mvc.crud.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.crud.model.Estudiante;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long>{

	
}
