package com.autosmvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auto {
	private int id;
	
	private String marca;
	
	private int modelo;
	
	private int cantPuertas;
	
	private float precio;
}
