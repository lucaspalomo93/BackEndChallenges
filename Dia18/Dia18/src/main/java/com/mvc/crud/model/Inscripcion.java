package com.mvc.crud.model;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table(name = "inscripcion")
@Data
public class Inscripcion {
	private Estudiante estudiante;
}
