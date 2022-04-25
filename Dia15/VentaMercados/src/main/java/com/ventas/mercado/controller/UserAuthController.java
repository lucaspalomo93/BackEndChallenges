package com.ventas.mercado.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.mercado.model.UsuarioModel;
import com.ventas.mercado.request.LoginRequest;
import com.ventas.mercado.service.UsuarioService;


@RestController
@RequestMapping("/api/auth")
public class UserAuthController {

	@Autowired
	UsuarioService uService;

	@Autowired
	PasswordEncoder encoder;

	@PostMapping("/login")
	public <T> ResponseEntity<T> auth(@Valid @RequestBody LoginRequest loginRequest, UsuarioModel usuario) {
		loginRequest.setEmail(usuario.getEmail());
		loginRequest.setPassword(usuario.getPassword());
		
		if(uService.existsByEmail(loginRequest.getEmail())) {
			if(uService.existsByPassword(loginRequest.getPassword())) {
				return new ResponseEntity("OK", HttpStatus.OK);
			}
		}
		return new ResponseEntity("El email ya existe", HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/register")
	public ResponseEntity<String> register(@Valid @RequestBody UsuarioModel usuario) {
		if (uService.existsById(usuario.getIdusuario())) {
			return new ResponseEntity("El usuario ya existe", HttpStatus.BAD_REQUEST);
		}
		if (uService.existsByEmail(usuario.getEmail())) {
			return new ResponseEntity("El email ya existe", HttpStatus.BAD_REQUEST);
		}

		usuario.setPassword(encoder.encode(usuario.getPassword()));
		uService.save(usuario);
		return ResponseEntity.status(200).body("OK");
	}
}
