package br.com.api.cmv.teste_sifat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TesteSifatApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSifatApplication.class, args);
	}

}
