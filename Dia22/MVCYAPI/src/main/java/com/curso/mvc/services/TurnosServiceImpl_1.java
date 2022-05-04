package com.curso.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.mvc.models.Turno;
import com.curso.mvc.repositories.ITurnosRepository;

@Service
public class TurnosServiceImpl implements ITurnosService{

	@Autowired
	private ITurnosRepository tRepository;
	
	@Override
	public List<Turno> findAll() {
		return tRepository.findAll();
	}

	@Override
	public Optional<Turno> findById(Long id) {
		return tRepository.findById(id);
	}

	@Override
	public Turno save(Turno turno) {
		return tRepository.save(turno);		
	}

	@Override
	public void deleteById(Long id) {
		tRepository.deleteById(id);
	}

}
