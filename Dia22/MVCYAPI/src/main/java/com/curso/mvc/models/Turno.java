package com.curso.mvc.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Turno")
public class Turno {
	
	@Id
	private String id;
	
	private LocalDateTime dateTime;
	
	private long idEspecialidad;

	public Turno(String id, LocalDateTime dateTime, long idEspecialidad) {
		this.id = id;
		this.dateTime = dateTime;
		this.idEspecialidad = idEspecialidad;
	}

	public Turno() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public long getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
	
	
}
