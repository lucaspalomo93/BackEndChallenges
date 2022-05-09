package com.pair.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pair.login.service.UserService;
import com.pair.models.Usuario;


@RestController
@RequestMapping("/api")
public class UsuarioController {
		@Autowired
		private UserService uService;
		
	    @GetMapping("/home")
	    public ResponseEntity<Usuario> home() {
	    	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	          Usuario user = uService.findByUsername(auth.getName());
	          return ResponseEntity.ok().body(user);
	    }
	    
	    @PostMapping("/create")
	    public Usuario crearUsuario(Usuario usuario) {
	    	return uService.saveUser(usuario);
	    }
}
