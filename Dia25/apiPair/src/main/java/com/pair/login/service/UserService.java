package com.pair.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pair.models.Roles;
import com.pair.models.Usuario;
import com.pair.repositories.IRolRepository;
import com.pair.repositories.IUsuarioRepository;

@Service
public class UserService {
		private IRolRepository rRepository;
		private IUsuarioRepository uRepository;
		private BCryptPasswordEncoder passEncoder;
		
		@Autowired
		public UserService(IRolRepository rRepository,
							IUsuarioRepository uRepository,
							BCryptPasswordEncoder encoder) {
			
			this.rRepository = rRepository;
			this.uRepository = uRepository;
			this.passEncoder = encoder;

		}
		
		public Usuario findByUsername(String username) {
			return uRepository.findByUsername(username);
		}
		
		public Usuario saveUser(Usuario usuario) {
			usuario.setPassword(passEncoder.encode(usuario.getPassword()));
			Roles userRole = rRepository.findByNombreRol("BASIC");
			List<Roles> roles = new ArrayList<>();
			roles.add(userRole);
	        usuario.setRoles(roles);
			return uRepository.save(usuario);
		}
}
