package com.user9.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.user9.model.Product;
import com.user9.repository.Productrepository;

@Component
public class Myrunner implements CommandLineRunner {

	@Autowired
	Productrepository pr;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		pr.save(new Product(104,"Iphone 12", 45000.00,"blue"));
		
	  pr.findAll().forEach(map->System.out.println(map.getName()));
	}

}
