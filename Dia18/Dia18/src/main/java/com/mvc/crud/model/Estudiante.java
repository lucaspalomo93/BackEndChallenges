package com.mvc.crud.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "estudiante")
public class Estudiante{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dni;
	private String nombre;
	private String apellido;
	private String telefono;
	
	@OneToMany(targetEntity = Materia.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cm_fk", referencedColumnName = "id")
	private List<Materia> materias;
}
