package com.user13.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user13.Model.Employee;
import com.user13.serv.EmpServ;

@RestController
public class Myrunner {
	@Autowired
	EmpServ eser;
	
	@PostMapping("/add")
	public void addData(@RequestBody Employee emp) {
		eser.addData(emp);
		
	}
	
	@GetMapping("/get")
	public List<Employee> getdata(){
		return eser.getdata();
	}

}
