package com.pair.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pair.models.Venta;
import com.pair.repositories.IVentaRepository;

@Service
public class VentaService {
	
	@Autowired
	private IVentaRepository vRepository;
	
	public List<Venta> findAll(){
		return vRepository.findAll();
	}
	
	public Venta save(Venta venta) {
		return vRepository.save(venta);
	}
	
	public Optional<Venta> findById(Long id) {
		return vRepository.findById(id);
	}
	
}
