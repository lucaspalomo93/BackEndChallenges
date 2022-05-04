package com.clientes.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.clientes.models.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl cService;
	
	@GetMapping
	public String inicio(Model model) {
		
		List<Cliente> clientes = cService.findAll();
		model.addAttribute("clientes", clientes);
		return "home";
	}
	
	@GetMapping("/crear")
	public String cearCliente(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "formularioCrear";
	}
	
	@PostMapping("/crear")
	public String saveCliente(Cliente cliente, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("clienteFlash", cliente);
				
		cService.save(cliente);
		return "redirect:/clientes";
	}
		
	@GetMapping("/eliminar/{id}")
	public String eliminarCliente(@PathVariable(value = "id") Long id, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("clienteFlashEliminado", id);
		cService.deleteById(id);
		return "redirect:/clientes";
	}
	
	@GetMapping("/eliminado")
	public String eliminado() {
		return "eliminado";
	}
}
