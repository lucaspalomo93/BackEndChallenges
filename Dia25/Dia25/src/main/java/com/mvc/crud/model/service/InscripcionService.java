package com.mvc.crud.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.crud.model.Inscripcion;
import com.mvc.crud.model.repository.IInscripcionRepository;

@Service
public class InscripcionService {
	
	@Autowired
	private IInscripcionRepository iRepository;
	
	public List<Inscripcion> findAll(){
		return iRepository.findAll();
	}
	
	public Optional<Inscripcion> findById(Long id) {
		return iRepository.findById(id);
	}
	
	public Inscripcion save(Inscripcion inscripcion) {
		return save(inscripcion);
	}
	
	public void deleteById(Long id) {
		iRepository.deleteById(id);
	}
}
