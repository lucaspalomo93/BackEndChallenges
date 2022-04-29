package com.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientes.controller.service.ClienteServiceImpl;
import com.clientes.models.Cliente;

@Controller
public class ClienteController {

	@Autowired
	private ClienteServiceImpl cService;
	
	@GetMapping("/clientes")
	public String listaClientes(Model model) {
		model.addAttribute("clientes", cService.findAll());
		return "listar";
	}
	
	@GetMapping("/crear")
	public String formularioCliente(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "crearCliente";
	}
	
	@PostMapping("/crear")
	public String guardarUsuario(@ModelAttribute("cliente") Cliente cliente) {
		cService.save(cliente);
		return "redirect:/clientes";
	}
}
