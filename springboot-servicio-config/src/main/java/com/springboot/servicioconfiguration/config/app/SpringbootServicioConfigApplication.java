package com.springboot.servicioconfiguration.config.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootServicioConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioConfigApplication.class, args);
	}

}
