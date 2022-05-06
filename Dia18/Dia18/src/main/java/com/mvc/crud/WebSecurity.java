package com.mvc.crud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurity extends WebSecurityConfigurerAdapter{
	   
		/*
	        @Override
	        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	            auth.inMemoryAuthentication()
	                    .withUser("usuario").password("123").roles("USER")
	                    .and()
	                    .withUser("administrador").password("123").roles("ADMIN");
	        }
	 	*/
	
	        @Bean 
	        public PasswordEncoder passwordEncoder() { 
	            return new BCryptPasswordEncoder(); 
	        }
	        
	        @Override
	        public void configure(HttpSecurity http) throws Exception {
	            http.csrf().disable()
	            	.authorizeRequests()
	                .antMatchers(HttpMethod.GET,"/usuario/**")
	                .permitAll()
	                .anyRequest()
	                .authenticated()
	                .and()
	                .httpBasic();
	        }
	        
	        @Override
	        @Bean
	        protected UserDetailsService userDetailsService() {
	        	UserDetails lucas = User.builder().username("lucas").password(passwordEncoder()
	        			.encode("lucas123")).roles("USER").build();
	        	UserDetails admin = User.builder().username("admin").password(passwordEncoder()
	        			.encode("admin123")).roles("ADMIN").build();
	        	
	        	return new InMemoryUserDetailsManager(lucas, admin);
	        }
}
