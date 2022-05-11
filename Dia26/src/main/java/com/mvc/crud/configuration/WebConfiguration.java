package com.mvc.crud.configuration;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfiguration implements WebMvcConfigurer{
	//CONFIGURACION FORMATO XML Y JSON
	  @Override
	  public void configureContentNegotiation(ContentNegotiationConfigurer configure){
	  		configure.favorParameter(true)
	  		.parameterName("type_format")
	  		.ignoreAcceptHeader(true)
	  		.defaultContentType(MediaType.APPLICATION_JSON)
	  		.mediaType("xml", MediaType.APPLICATION_XML)
	  		.mediaType("json", MediaType.APPLICATION_JSON);
	  }
	  
	 
}
