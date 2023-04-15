package com.user14.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user14.model.Employee;
import com.user14.repo.Repo;

@Service
public class Eservice {
	@Autowired
	Repo repo;
	
	public void insertData(Employee emp) {
		repo.save(emp);
	}
	
	public List<Employee> getData(){
		return	repo.findAll();
	}
	
	public void deletedata() {
		repo.deleteAll();
	}

}
