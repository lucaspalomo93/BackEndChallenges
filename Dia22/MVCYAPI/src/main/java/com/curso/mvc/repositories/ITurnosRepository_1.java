package com.curso.mvc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.curso.mvc.models.Turno;

@Repository
public interface ITurnosRepository extends MongoRepository<Turno, Long>{

}
