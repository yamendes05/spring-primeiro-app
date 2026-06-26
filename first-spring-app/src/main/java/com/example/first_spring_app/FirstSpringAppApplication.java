package com.example.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
// essa classe vai ser a classe principa da nossa aplicação spring
@SpringBootApplication
//definir o ambiente que quero que ele use 
@Profile("dev")
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
