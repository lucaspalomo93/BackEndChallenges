package com.mvc.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.crud.model.Inscripcion;
import com.mvc.crud.repository.InscripcionRepository;

@Service
public class InscripcionService {
	@Autowired
	private InscripcionRepository iRepository;
	
	public List<Inscripcion> findAll(){
		return iRepository.findAll();
	}
	
	public Optional<Inscripcion> getById(Long id) {
		if(iRepository.existsById(id)) {
			return iRepository.findById(id);
		}
		return null;
	}
	
	public Inscripcion save(Inscripcion inscripcion) {
		if(inscripcion.getEstudiante() != null) {
			return iRepository.save(inscripcion);
		}
		return null;
	}
	
	Inscripcion updateInscripcion(Long id, Inscripcion inscripcion) {
		if(iRepository.existsById(id)) {
			if(inscripcion.getEstudiante() != null) {
				return iRepository.save(inscripcion);
			}
		}
		return null;
	}
	
	public Inscripcion deleteById(Long id) {
		if(iRepository.existsById(id)) {
			iRepository.deleteById(id);
		}
		return null;
	}
}
