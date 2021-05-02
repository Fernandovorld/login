package com.springboot.serviciousuario.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EntityScan({"com.springboot.serviciousuario.commons.app.model.entity"})
@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioUsuarioApplication.class, args);
	}

}
