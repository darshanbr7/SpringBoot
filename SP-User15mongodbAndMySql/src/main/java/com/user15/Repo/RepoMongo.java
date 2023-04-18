package com.user15.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user15.EmpDocument.EmployeeMongodb;
@Repository
public interface RepoMongo extends MongoRepository<EmployeeMongodb, Integer> {
	EmployeeMongodb getByid(int id);
	EmployeeMongodb getByname(String name);
	EmployeeMongodb findByname(String name);
	

}
