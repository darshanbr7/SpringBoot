package com.psa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psa.db.DB_impl;
@Component
public class Myrunner implements CommandLineRunner {
  @Autowired
  DB_impl db;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		db.insertRecords();
		
	}

}
