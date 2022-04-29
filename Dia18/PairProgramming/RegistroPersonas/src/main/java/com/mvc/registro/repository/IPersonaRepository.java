package com.mvc.registro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.registro.models.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{

}
