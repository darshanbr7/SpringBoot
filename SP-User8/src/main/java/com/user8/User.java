package com.user8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class User implements UserRepo {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void insertRecord() {
		// TODO Auto-generated method stub
		String inst= "create table user (id int,name varchar(20))";
		System.out.println("succesfull");
		jt.update(inst);
		
	}

}
