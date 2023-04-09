package com.example.realestateaccounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class RealEstateAccountingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateAccountingApplication.class, args);
	}

}
