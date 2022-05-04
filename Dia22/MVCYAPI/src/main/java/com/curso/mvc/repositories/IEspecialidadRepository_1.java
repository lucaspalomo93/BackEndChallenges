package com.curso.mvc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.curso.mvc.models.Especialidad;

@Repository
public interface IEspecialidadRepository extends MongoRepository<Especialidad, String>{

}
