package com.psa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.psa")
public class SpUser1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpUser1Application.class, args);
	}

}
