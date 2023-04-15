package com.user14.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user14.model.Employee;
@Repository
public interface Repo extends MongoRepository<Employee,Integer> {

}
