package com.templates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.templates.models.Client;

@Controller
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private IClientService cService;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("clients", cService.findAll());
		
		return "index";
	}
	
	@GetMapping("/create")
	public String createClient(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "createForm";
	}
	
	@PostMapping("/create")
	public String saveClient(@ModelAttribute("client") Client client) {
			cService.save(client);
			return "redirect:/clients";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteClient(@PathVariable(value = "id") Long id) {
		cService.deleteById(id);
		return "redirect:/clients";
	}
	
}
