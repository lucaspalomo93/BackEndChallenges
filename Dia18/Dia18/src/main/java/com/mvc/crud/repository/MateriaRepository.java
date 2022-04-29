package com.mvc.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.crud.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long>{

}
