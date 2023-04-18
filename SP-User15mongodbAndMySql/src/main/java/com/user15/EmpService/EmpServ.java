package com.user15.EmpService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user15.EmpDocument.EmployeeMongodb;
import com.user15.EmpEntity.EmployeeMysql;
import com.user15.Repo.RepoMongo;
import com.user15.Repo.RepoMysql;

@Service
public class EmpServ {
	@Autowired
	RepoMongo rmongo;
	
	@Autowired 
	RepoMysql rmysql;
	
	// insert  or Create
	public void insertData(EmployeeMysql em) {
		rmysql.save(em);
	}
    
	public void insertProduct(EmployeeMongodb ep) {
		rmongo.save(ep);
	}
	
	// read
	public List<EmployeeMysql> getData(){
		return rmysql.findAll();
	}

	public List<EmployeeMongodb> getProduct() {
		
		return rmongo.findAll();
	}
	
	// update
	public void updateEmployee(int id,EmployeeMysql em) {
		EmployeeMysql	emp=rmysql.getByeId(id);
		emp.seteName(em.geteName());
		emp.seteEmail(em.geteEmail());
		rmysql.save(emp);
	}
	
	public void updateProduct(int id,EmployeeMongodb ep) {
		EmployeeMongodb eproduct=rmongo.getByid(id);
		eproduct.setName(ep.getName());	
		 eproduct.setPrice(ep.getPrice());	
		 rmongo.save(eproduct);
	}
	
	// Delete by id 
	public void deleteEmployeeById(int id) {
		rmysql.deleteById(id);
	}
	
	public void deleteProductById(int id) {
		rmongo.deleteById(id);
	}
	
	// update by name
	public  EmployeeMysql updateEmployeeByName(String eName,EmployeeMysql e) {
		EmployeeMysql emp=rmysql.getByeName(eName);
		emp.seteName(e.geteName());
		 return rmysql.save(emp);
	}
	
	public void updateProductByName(String name,EmployeeMongodb em) {
		EmployeeMongodb en=rmongo.getByname(name);
		en.setName(em.getName());
		rmongo.save(en);
	}
	
	// find by name
	public EmployeeMongodb getProductByName(String name){
		 return rmongo.findByname(name);
	}
	
}
