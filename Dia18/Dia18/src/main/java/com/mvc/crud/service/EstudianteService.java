package com.mvc.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.crud.model.Estudiante;
import com.mvc.crud.repository.EstudianteRepository;

@Service
public class EstudianteService {
	
	@Autowired
	private EstudianteRepository eRepository;
	
	List<Estudiante> findAll(){
		return eRepository.findAll();
	}
	
	Optional<Estudiante> findById(Long id){
		if(eRepository.existsById(id)) {
			return eRepository.findById(id);
		}
		return null;
	}
	
	Estudiante save(Estudiante estudiante) {
		if(estudiante.getApellido() != null && estudiante.getDni() != null && 
				estudiante.getMaterias() != null && estudiante.getNombre() != null &&
				estudiante.getTelefono() != null) {
			return eRepository.save(estudiante);
		}
		return null;
	}
	
	Estudiante update(Long id, Estudiante estudiante) {
		if(eRepository.existsById(id)) {
			if(estudiante.getApellido() != null && estudiante.getDni() != null && 
					estudiante.getMaterias() != null && estudiante.getNombre() != null &&
					estudiante.getTelefono() != null) {
				return eRepository.save(estudiante);
			}
		}
		return null;
	}
	
	Estudiante deleteById(Long id) {
		if(eRepository.existsById(id)) {
			eRepository.deleteById(id);
		}
		return null;
	}
	
}
