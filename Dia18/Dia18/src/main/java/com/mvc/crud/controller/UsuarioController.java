package com.mvc.crud.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.crud.model.Usuario;
import com.mvc.crud.model.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService uService;
	
	//Le pasamos el numero de paginas
	@GetMapping("/{nroPaginas}") //Agarramos el nro como parametro
	public String getAllUsuario(Model model, @PathVariable int nroPaginas) { 
		//Llamamos al findAll de paginacion pasandole las paginas
		Page<Usuario> usuarios = uService.findAll(nroPaginas); 
		//Traemos el contenido de las paginas
		List<Usuario> listaUsuarios = usuarios.getContent(); 
		
		//Pasamos todos los atributos a la vista
		model.addAttribute("usuarios", listaUsuarios);
		model.addAttribute("paginasTotales", usuarios.getTotalPages());
		model.addAttribute("totalElementos", usuarios.getTotalElements());
		model.addAttribute("nroPaginas", nroPaginas);
		return "usuario/usuarioIndex";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/create") 
	public String showFormusuario(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "usuario/usuarioForm";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/create")
	public String saveusuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result) {
		if(result.hasErrors()) {
			return "usuario/usuarioForm";
		}
		uService.save(usuario);
		return "redirect:/usuario/0";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/update/{id}")
	public String updateusuario(@PathVariable("id") Long id, Model model) {
		Optional<Usuario> usuario = uService.findById(id);
		model.addAttribute("usuario", usuario);
		return "/usuario/usuarioForm";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/update/{id}")
	public String updateusuario(@PathVariable Long id, @Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result) {
		if(result.hasErrors()) {
			return "/usuario/usuarioForm";
		}
		uService.update(id, usuario);
		return "redirect:/usuario/0";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/delete/{id}")
	public String deleteusuario(@PathVariable("id") Long id) {
		Long idNuevo = Long.valueOf(id);
		uService.deleteById(id);
		return "redirect:/usuario/0";
	}
}
