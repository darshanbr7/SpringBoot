/**
 * 
 */
package com.user9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user9.model.Product;


public interface Productrepository extends JpaRepository<Product, Integer> {

}
