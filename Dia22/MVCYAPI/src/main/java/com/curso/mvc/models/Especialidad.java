package com.curso.mvc.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Especialidad")
public class Especialidad {

	@Id
	private String id;
	
	private String nombre;
	
	private int cantEsp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantEsp() {
		return cantEsp;
	}

	public void setCantEsp(int cantEsp) {
		this.cantEsp = cantEsp;
	}

	public Especialidad(String id, String nombre, int cantEsp) {
		this.id = id;
		this.nombre = nombre;
		this.cantEsp = cantEsp;
	}

	public Especialidad() {
	}
	
	
}
