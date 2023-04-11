package com.user11.runnerModule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user11.Employee.Employee;
import com.user11.service.EmpService;

@RestController
public class Module {
	 	 @Autowired
	 	 EmpService es;
	 	 
	 	 
	 	 // for inserting data into database
	 	 @PostMapping("/insert")
	 	 public void insertData(@RequestBody Employee emp) {
	 		 es.insertData(emp);
	 	 }
	 	 
	 	 // for fetching data from database
	 	 @GetMapping("/get")
	 	 public List<Employee> getData(){
	 		 return es.getData();
	 	 }
	 	 
	 	 // for updating a data
	 
	   /* public Employee updateEmployee(@RequestBody Employee emp) {
	        Employee updateResponse = es.update(emp);
	        return updateResponse;
	    }*/
	 	 
	 	@PutMapping("/update/{id}")
	 	 public void update(@RequestBody String name,@PathVariable Integer id) {
	 		es.update( id,name);
	 	}
}
