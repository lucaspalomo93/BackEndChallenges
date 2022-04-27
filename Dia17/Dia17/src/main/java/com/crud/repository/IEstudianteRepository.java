package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.models.Estudiante;


@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long>{
	Estudiante save(Estudiante estudiante);
	void deleteById(Long id);
	Estudiante updateUser(Long id, Estudiante estudiante);
}
