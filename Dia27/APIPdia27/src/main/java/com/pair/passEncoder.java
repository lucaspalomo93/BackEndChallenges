package com.pair;

import org.springframework.boot.SpringApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passEncoder {

	public static void main(String[] args) {
		
			String cadena = "123";
			System.out.println(encode(cadena));

	}
	
	public static String encode(String cadena) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(cadena);
	}
}
