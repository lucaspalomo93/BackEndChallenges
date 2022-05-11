package com.mvc.crud.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.crud.model.Materia;
import com.mvc.crud.model.repository.IMateriaRepository;

@Service
public class MateriaService {

	@Autowired
	private IMateriaRepository mRepository;
	
	List<Materia> findAll(){
		return mRepository.findAll();
	}
	
	Optional<Materia> findById(Long id){
		if(mRepository.existsById(id)) {
			return mRepository.findById(id);
		}
		return null;
	}
	
	Materia save(Materia materia) {
		if(materia.getCodigo() != null && materia.getNombreMateria() != null) {
			return mRepository.save(materia);
		}
		return null;
	}
	
	Materia update(Long id, Materia materia) {
		if(mRepository.existsById(id)) {
			if(materia.getCodigo() != null && materia.getNombreMateria() != null) {
				return mRepository.save(materia);
			}
		}
		return null;
	}
	
	Materia deleteById(Long id) {
		if(mRepository.existsById(id)) {
			mRepository.deleteById(id);
		}
		return null;
	}
}
