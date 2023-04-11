package com.user11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user11.Employee.Employee;
import com.user11.repo.EmployeeRepo;

@Service
public class EmpService {
      @Autowired
      EmployeeRepo er;
      
      // for inserting data into database
      public void insertData(Employee emp) {
    	  er.save(emp);
      }
      
      //fetching data from database
      public List<Employee> getData(){
    	  return er.findAll();
      }
      
     /*   public Employee update(Employee student) {
          Employee updateResponse = er.save(student);
          return updateResponse;
      }*/
      
    /* public List<Employee> update (Integer id, String name){
    	 List<Employee > e=e.get(id);
    	 return;
     }*/
}
