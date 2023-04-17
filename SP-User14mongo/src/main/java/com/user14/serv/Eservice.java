package com.user14.serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.user14.model.Employee;
import com.user14.repo.Repo;

@Service
public class Eservice {
	@Autowired
  private Repo repo;
	
	public void insertData(Employee emp) {
		repo.save(emp);
	}
	
	public List<Employee> getData(){
		return	repo.findAll();
	}
	
	public void deletedata() {
		repo.deleteAll();
	}
	/*
	public ResponseEntity<Product> updateProducts(Integer id,
			Product product)
	{
		Product getProd=ProdRepo.getById(id);
		getProd.setProductName(product.getProductName());
		getProd.setProductPrice(product.getProductPrice());
		getProd.setProductQty(product.getProductQty());
		
		Product updateProd=ProdRepo.save(getProd);
		return ResponseEntity.ok().body(updateProd);
	}*/

   /*   public ResponseEntity<Employee>  updateData(int id ,Employee empl) {
    	   Employee emp=repo.findbyid(id);
    	   emp.seteName(empl.geteName());
    	   emp.seteSal(empl.geteSal());
    	   
    	   Employee UpdatedEmployee=repo.save(emp);
    	   return ResponseEntity.ok().body(UpdatedEmployee);
    	   
    	      
      }*/
	
	public void updateEmployee(int id, Employee empl) {
		  Employee emp=repo.getEmployeeByeId(id);
		  emp.seteName(empl.geteName());
		  emp.seteSal(empl.geteSal());
		 repo.save(emp);
		  
	}

	
}
