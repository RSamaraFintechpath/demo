package com.fintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories
public class OpenApiSpecificationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenApiSpecificationDemoApplication.class, args);
	}

}
