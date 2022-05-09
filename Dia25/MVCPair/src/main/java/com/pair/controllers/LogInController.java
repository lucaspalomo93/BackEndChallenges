package com.pair.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.pair.models.Usuario;


@Controller
public class LogInController {
	//private final String USUARIO_RUTA = "http://localhost:8080/api";
	private final String USUARIO_CREATE = "http://localhost:8080/api/create";
	
    @GetMapping( "/register")
    public String login(Model model) {
    	Usuario u = new Usuario();
    	model.addAttribute("usuario", u);
    	return "register";
    }
    
    @PostMapping("/register")
    public String procesarLogin(Usuario usuario, Model model) {
    	RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(USUARIO_CREATE, usuario, Usuario.class);
		return "redirect:/bienvenida";
    }
    
    @GetMapping("/bienvenida")
    public String usuarioRegistrado() {
    	return "bienvenida";
    }
    
}
