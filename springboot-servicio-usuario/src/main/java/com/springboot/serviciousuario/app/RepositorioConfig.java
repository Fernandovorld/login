package com.springboot.serviciousuario.app;

import org.springframework.context.annotation.Configuration;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.springboot.serviciousuario.commons.app.model.entity.Role;
import com.springboot.serviciousuario.commons.app.model.entity.Usuario;

@Configuration
public class RepositorioConfig implements RepositoryRestConfigurer{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}

}
