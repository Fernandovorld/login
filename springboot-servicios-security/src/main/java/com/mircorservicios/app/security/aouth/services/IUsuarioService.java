package com.mircorservicios.app.security.aouth.services;

import java.util.List;

import com.springboot.serviciousuario.commons.app.model.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
