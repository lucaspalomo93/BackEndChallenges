package com.pair.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pair.models.Venta;
import com.pair.services.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private VentaService vService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Venta>> listar(){
		return ResponseEntity.ok().body(vService.findAll());
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Optional<Venta>> unaVenta(@PathVariable Long id){
		return ResponseEntity.ok().body(vService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Venta> save(@RequestBody Venta venta){
		return ResponseEntity.ok().body(vService.save(venta));
	}
}
