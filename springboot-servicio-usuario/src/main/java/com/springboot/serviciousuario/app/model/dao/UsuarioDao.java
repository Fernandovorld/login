package com.springboot.serviciousuario.app.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import  com.springboot.serviciousuario.commons.app.model.entity.Usuario;

@Repository
@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {
	
	@RestResource(path = "buscar-username")
	public Usuario findByUsername(@Param("username") String username);

	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsername(String username);

}
