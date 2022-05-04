package com.curso.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.mvc.models.Especialidad;
import com.curso.mvc.repositories.IEspecialidadRepository;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	@Autowired
	private IEspecialidadRepository eRepository;
	
	@Override
	public List<Especialidad> findAll() {
		return eRepository.findAll();
	}

	@Override
	public Optional<Especialidad> findById(String id) {
		return eRepository.findById(id);
	}

	@Override
	public Especialidad save(Especialidad especialidad) {
			return eRepository.save(especialidad);
	}

	@Override
	public void deleteById(String id) {
			eRepository.deleteById(id);		
	}

}
