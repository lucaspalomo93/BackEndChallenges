package com.autosmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.autosmvc.models.Auto;


@Controller
@RequestMapping("/autos")
public class AutoController {

	@GetMapping("/create")
	public String crearAuto(Model model) {
		Auto auto = new Auto();
		model.addAttribute("auto", auto);
		return "createAuto";
	}
	
	@PostMapping("/create")
		public String guardarAuto(@ModelAttribute("auto") Auto auto, RedirectAttributes atributes) {
			atributes.addFlashAttribute("auto",auto);
			return "redirect:/autos/mostrar";
		}
	
	@GetMapping("/mostrar")
	public String mostrarAuto() {
		return "mostrar";
	}
}
