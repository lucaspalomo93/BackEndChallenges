package com.ventas.mercado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idproductos;
	
	@Column
	private String nombre;
	
	@Column(unique = true)
	private String codigo;
	
	@Column
	private int cantidad;
	
	@Column
	private double precio;
}
