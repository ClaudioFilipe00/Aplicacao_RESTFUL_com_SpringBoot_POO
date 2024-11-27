package com.example.swag;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @brief Classe principal que inicia a aplicação Spring Boot e configura a documentação da API utilizando OpenAPI.
 * Define o ponto de entrada da aplicação.
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Produtos API", version = "v1", description = "API para gerenciar produtos"))
public class SwagApplication {

	/**
	 * @brief Método principal que inicia a aplicação Spring Boot.
	 * @param args Argumentos da linha de comando (não utilizados).
	 */
	public static void main(String[] args) {
		SpringApplication.run(SwagApplication.class, args);
	}
}
