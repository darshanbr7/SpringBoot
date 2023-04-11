package com.user10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.user10.product.Product;

@Repository
public interface Productrepo extends JpaRepository<Product, Integer> {
	@Query("Select e  from  Product e where e.name=?1")
	List<Product> getname(String name);
	
	
}
