package com.pair.login.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.pair.models.Roles;
import com.pair.models.Usuario;



@Service
public class UserDetailService implements UserDetailsService{
	@Autowired
	private UserService uService;
	
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) {
        Usuario user = uService.findByUsername(userName);
        List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
        return buildUserForAuthentication(user, authorities);
    }
    
    private List<GrantedAuthority> getUserAuthority(List<Roles> userRoles) {
        List<GrantedAuthority> roles = new ArrayList<>();
        for (Roles role : userRoles) {
            roles.add(new SimpleGrantedAuthority(role.getNombreRol()));
        }
        return new ArrayList<>(roles);
    }
    
    private UserDetails buildUserForAuthentication(Usuario user, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                user.getActive(), true, true, true, authorities);
    }
}
