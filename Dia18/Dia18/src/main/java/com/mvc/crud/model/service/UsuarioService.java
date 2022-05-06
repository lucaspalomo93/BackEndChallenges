package com.mvc.crud.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.mvc.crud.model.Usuario;
import com.mvc.crud.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository uRepository;
	
	public List<Usuario> findAll(){
		return uRepository.findAll();
	}
	
	public Page<Usuario> findAll(int nroPaginas){
		int tamPagina = 2;
		Pageable cantidad = PageRequest.of(nroPaginas, tamPagina);
		return uRepository.findAll(cantidad);
	}
	
	public Optional<Usuario> findById(Long id){
		return uRepository.findById(id);
	}
	
	public Usuario save(@RequestBody Usuario usuario) {
		return uRepository.save(usuario);
	}
	
	public void update(@PathVariable Long id, @RequestBody Usuario usuario) {
		if(uRepository.existsById(id)) {
			uRepository.save(usuario);
		}
	}
	
	public void deleteById(@PathVariable Long id) {
		uRepository.deleteById(id);
	}
}
