package com.ventas.mercado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClientesModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idclientes;
	
	@Column
	private String nombre;
	
	@Column
	private String email;
	
	@Column
	private String apellido;
	
	@Column
	private String telefono;
	
	@Column(unique = true)
	private String dni;
	
}
