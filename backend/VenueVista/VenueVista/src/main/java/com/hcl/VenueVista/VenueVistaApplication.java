package com.hcl.VenueVista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.hcl")
@EnableJpaRepositories(basePackages = "com.hcl.repository")
@EntityScan(basePackages = "com.hcl.model")
public class VenueVistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenueVistaApplication.class, args);
	}

}
