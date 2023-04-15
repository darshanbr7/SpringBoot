package com.user13.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user13.Model.Employee;
@Repository
public interface Repo extends MongoRepository<Employee, Integer> {

}
