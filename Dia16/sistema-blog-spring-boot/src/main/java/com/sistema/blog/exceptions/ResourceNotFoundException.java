package com.sistema.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombreDelRecurso;
	private String nombreDelCampo;
	
	

}
