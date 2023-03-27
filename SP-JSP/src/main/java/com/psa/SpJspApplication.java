package com.psa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.psa")
public class SpJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpJspApplication.class, args);
	}

}
