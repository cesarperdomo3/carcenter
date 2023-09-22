package com.proyecto.carcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.proyecto.carcenter")
public class CarcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarcenterApplication.class, args);
	}

}
