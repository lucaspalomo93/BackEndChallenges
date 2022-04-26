package com.crud.lecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.lecture.model.Animal;

@Repository
public interface IAnimalRepository extends JpaRepository<Animal, Long>{
	
}
