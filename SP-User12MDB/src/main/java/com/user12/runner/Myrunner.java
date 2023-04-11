package com.user12.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.user12.Document.Documnetpr;
import com.user12.repo.Repo;
@Component
public class Myrunner implements CommandLineRunner {

	
	@Autowired 
	Repo pr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		pr.save(new Documnetpr(10,"iphone",1000.00));
		
	}

}
