package com.mvc.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.mvc.models.Cliente;

@Controller
@RequestMapping()
public class ClienteController {

	private final String CLIENTES = "http://localhost:8080/clientes/";
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/todos")
	public String listar(Model model) {
		String url = CLIENTES;
		RestTemplate restTemplate = new RestTemplate();
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes = restTemplate.getForObject(url, ArrayList.class);
		model.addAttribute("clientes", clientes);
		return "listar";
	}

	@GetMapping("/crear")
	public String crear(Model model) {
		Cliente cliente = new Cliente();

		model.addAttribute("cliente", cliente);
		return "clientForm";
	}

	
	@PostMapping("/crear")
	public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(CLIENTES, cliente, Cliente.class);
		return "redirect:/todos";
	}
	
	@GetMapping("/crear/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Cliente cliente = null;
		if(id > 0) {
			String url = CLIENTES+id;
			RestTemplate restTemplate = new RestTemplate();
			cliente = restTemplate.getForObject(url, Cliente.class);
			model.addAttribute("cliente", cliente);
		}else {
			return "redirect:/todos";
		}
		return "clientForm";
	}
	
	
	
	@GetMapping("/eliminar/{id}")
	public String eliminado(Model model, @PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(CLIENTES + id);
        return "redirect:/todos";
}
}
