package com.mvc.crud.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.crud.configuration.ExportExcel;
import com.mvc.crud.model.Usuario;
import com.mvc.crud.model.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	@Autowired
	private UsuarioService uService;
	
	//, consumes = {"application/json","application/xml"},produces = {"application/json","application/xml"}
	@GetMapping(value = "/users/all",produces = {"application/json","application/xml"})
	public ResponseEntity<List<Usuario>> getAllUsers(){
		return ResponseEntity.ok().body(uService.findAll());
	}
	
	@GetMapping(value = "/user/{id}", produces = {"application/json","application/xml"})
	public ResponseEntity<Optional<Usuario>> getusuario(@PathVariable Long id){
		return ResponseEntity.ok().body(uService.findById(id));
	}
	
	@PostMapping(value = "/create/{id}", produces = {"application/json","application/xml"})
	public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){
		return ResponseEntity.ok().body(uService.save(usuario));
	}
	
	@PutMapping(value = "/update/{id}", produces = {"application/json","application/xml"})
	public ResponseEntity<Usuario> updateUser(@PathVariable Long id, @RequestBody Usuario usuario){
		
		
		return ResponseEntity.ok().body(uService.update(usuario));
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {"application/json","application/xml"})
	public ResponseEntity<UsuarioService> deleteUser(@PathVariable Long id){
		uService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/excel")
	public void writeExcelFile(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=usuarios.xlsx");
		List<Usuario> usuarios = uService.findAll();
		ExportExcel excel = new ExportExcel(usuarios);
		excel.CreateXcelFile(response);
		
	}
	
}
