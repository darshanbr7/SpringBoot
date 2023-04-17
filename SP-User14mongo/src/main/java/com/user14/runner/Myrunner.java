package com.user14.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user14.model.Employee;
import com.user14.serv.Eservice;

@RestController
public class Myrunner {
	@Autowired
	 private Eservice es;
	
	@PostMapping("/add")
	public String addData(@RequestBody Employee emp) {
		es.insertData(emp);
		return "inserted succesfully";
	}
	
	@GetMapping("/get")
	public List<Employee> getData(){
		return es.getData();
	}
	
	@DeleteMapping("/delete")
	public String deleteData() {
		es.deletedata();
		return "deleted All Data";
	}
	
	@PutMapping("/update/{id}")
	public String updateProducts(@PathVariable int id, @RequestBody Employee emp)
	{
		  es.updateEmployee(id, emp);
		  return "updated succesfully";
	}
}
