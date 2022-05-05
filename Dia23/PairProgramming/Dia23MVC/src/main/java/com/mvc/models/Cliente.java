package com.mvc.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	private Long id;
	
	@NotNull
	private int dni;
	
	@NotEmpty(message = "Campo no debe estar vacio")
	private String nombre;
	
	@NotEmpty(message = "Campo no debe estar vacio")
	private String apellido;
	
	@Email
	@NotEmpty
	private String email;
}
