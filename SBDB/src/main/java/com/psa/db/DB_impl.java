package com.psa.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DB_impl implements DBinterface {
    
	@Autowired
	 JdbcTemplate jt;
	@Override
	public void insertRecords() {
		// TODO Auto-generated method stub
		  String inst= "insert into detils values(110,'darshanbr')";
		  jt.update(inst);
		  System.out.println("inserted succesfully");
		
	}

}
