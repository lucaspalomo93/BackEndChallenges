package com.curso.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curso.mvc.models.Turno;

@Service
public interface ITurnosService {
	public List<Turno> findAll();
	public Optional<Turno> findById(Long id);
	public Turno save(Turno turno);
	public void deleteById(Long id);
}
