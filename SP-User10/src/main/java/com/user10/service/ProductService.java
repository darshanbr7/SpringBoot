package com.user10.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.user10.product.Product;
import com.user10.repository.Productrepo;
@Service
public class ProductService {
	@Autowired
	Productrepo prepo;
	
	public List<Product> getProduct(){
		return prepo.findAll();
	}
	public void addProduct(Product product) {
		prepo.save(product);
	}
	public List<Product> getname(){
		return prepo.getname("darshan");
	}
	
}
