package com.user12.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user12.Document.Documnetpr;

import jakarta.persistence.Id;

public interface Repo extends MongoRepository<Documnetpr, Id> {

}
