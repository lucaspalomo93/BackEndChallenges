package com.ventas.mercado.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.mercado.model.UsuarioModel;
import com.ventas.mercado.repository.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioRepository{

	@Autowired
	UsuarioRepository uRepository;
	
	@Override
	public <S extends UsuarioModel> S save(S entity) {
		// TODO Auto-generated method stub
		return uRepository.save(entity);
	}

	@Override
	public <S extends UsuarioModel> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Optional<UsuarioModel> findById(Long id) {
		// TODO Auto-generated method stub
		return uRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return uRepository.existsById(id);
	}

	@Override
	public Iterable<UsuarioModel> findAll() {
		// TODO Auto-generated method stub
		return uRepository.findAll();
	}

	@Override
	public Iterable<UsuarioModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UsuarioModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public Boolean existsByPassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
