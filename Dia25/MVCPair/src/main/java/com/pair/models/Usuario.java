package com.pair.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	private Long id;
	
	private String username;
	
	private String name;
	
	private String password;
	
	private boolean active;
	
	private List<Roles> roles;
}
