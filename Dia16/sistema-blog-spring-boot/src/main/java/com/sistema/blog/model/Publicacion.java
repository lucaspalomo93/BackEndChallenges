package com.sistema.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "publicaciones", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"titulo"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Publicacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Column(name = "titulo", nullable=false)
	private String titulo;
	
	@Column(name = "descripcion", nullable=false)
	private String descripcion;
	
	@Column(name = "contenido", nullable=false)
	private String contenido;
}
