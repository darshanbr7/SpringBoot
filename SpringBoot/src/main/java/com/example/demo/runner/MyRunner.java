package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.hellobeans.HelloBeans;

@Component
public class MyRunner implements CommandLineRunner {
    
	@Autowired
     HelloBeans obj;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test");
		obj.SayHello();
		
	}

}
