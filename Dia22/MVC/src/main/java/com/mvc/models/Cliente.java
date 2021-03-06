package com.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	private Long id;
	
	private String dni;
	
	private String nombre;
	
	private String apellido;
}
