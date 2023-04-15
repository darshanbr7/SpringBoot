package com.user13.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user13.Model.Employee;
import com.user13.repo.Repo;

@Service
public class EmpServ {
	@Autowired
	Repo repo;
	
	public void addData(Employee emp) {
		repo.save(emp);
	}
	
	public List<Employee> getdata(){
		 return repo.findAll();
	}

}
