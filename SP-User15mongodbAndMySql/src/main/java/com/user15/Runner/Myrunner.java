package com.user15.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user15.EmpDocument.EmployeeMongodb;
import com.user15.EmpEntity.EmployeeMysql;
import com.user15.EmpService.EmpServ;

@RestController
public class Myrunner {
	@Autowired
	EmpServ es;
	
	@PostMapping("/Employee/insert")
	public String insertEmployee(@RequestBody EmployeeMysql em) {
		es.insertData(em);
		 return "inserted Succesfully";
	}
	
	@PostMapping("/Product/insert")
	public String insertProduct(@RequestBody EmployeeMongodb ep ) {
		es.insertProduct(ep);
	return "inserted Succesfully";
	}
	
	@GetMapping("/Employee/get")
	public List<EmployeeMysql> getEmployee() {
		return es.getData();
	}
	
	@GetMapping("/Product/get")
	public List<EmployeeMongodb> getprouct() {
		return es.getProduct();
	}
	
	@PutMapping("/Employee/update/{id}")
	public String updateEmployee(@PathVariable int id,@RequestBody EmployeeMysql em) {
		es.updateEmployee(id, em);
		return "updated Succesfully";
	}
    
	@PutMapping("/Product/update/{id}")
	public String updateProduct(@PathVariable int id,@RequestBody EmployeeMongodb ep) {
		es.updateProduct(id, ep);
		return "updated Succesfully";
	}
	  
	
	
	
	@DeleteMapping("/Employee/delete/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		es.deleteEmployeeById(id);
		return "deleted Succesfully";
	}
	
	@DeleteMapping("/Product/delete/{id}")
	public String deleteProductById(@PathVariable int id) {
		es.deleteProductById(id);
		return "deleted Succesfully";
	}
	
	@PutMapping("/Employee/update/{name}")
	public EmployeeMysql updateEmployename(@PathVariable String ename,@RequestBody EmployeeMysql em ) {
		return es.updateEmployeeByName(ename,em);
		
	}
	
	@PutMapping("/Product/update/{name}")
	public String updateProductByName(@PathVariable String name,@RequestBody EmployeeMongodb ep ) {
		es.updateProductByName(name, ep);
		return "updated Succesfully";
	}
	
	@GetMapping("/Product/get/{name}")
	public EmployeeMongodb getprouctByName(@PathVariable String name ){
		return es.getProductByName(name);
	}
}
