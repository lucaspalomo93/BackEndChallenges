package com.ventas.mercado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.mercado.model.UsuarioModel;
import com.ventas.mercado.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService uService;
	
	@GetMapping("/todos")
	public List<UsuarioModel> findAll(){
		return (List<UsuarioModel>) uService.findAll();
	}
	
	@PostMapping("/agregar")
	public UsuarioModel save(@RequestBody UsuarioModel usuario) {
		return uService.save(usuario);
	}
}
