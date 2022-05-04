package com.curso.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curso.mvc.models.Especialidad;


@Service
public interface IEspecialidadService {
	public List<Especialidad> findAll();
	public Optional<Especialidad> findById(String id);
	public Especialidad save(Especialidad turno);
	public void deleteById(String id);
}
