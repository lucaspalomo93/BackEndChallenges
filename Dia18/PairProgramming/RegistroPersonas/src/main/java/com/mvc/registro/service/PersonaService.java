package com.mvc.registro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.registro.models.Persona;
import com.mvc.registro.repository.IPersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	private IPersonaRepository pRepository;
	
	public List<Persona> findAll(){
		return pRepository.findAll();
	}
	
	public Optional<Persona> getPersona(Long id) {
		if(pRepository.existsById(id)) {
			return pRepository.findById(id);
		}
		return null;
	}
	
	public Persona save(Persona persona) {
		if(persona.getApellido() != null && persona.getEdad() != 0 && persona.getNombre() != null) {
			pRepository.save(persona);
		}
		return null;
	}
	
	public Persona updatePersona(Long id, Persona persona) {
		if(pRepository.existsById(id)) {
			if(persona.getApellido() != null && persona.getEdad() != 0 && persona.getNombre() != null) {
				pRepository.save(persona);
			}
		}
		return null;
	}
	
	public Persona deletePersona(Long id) {
		if(pRepository.existsById(id)) {
			pRepository.deleteById(id);
		}
		return null;
	}

}
