package com.user10.Mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user10.product.Product;
import com.user10.service.ProductService;

@RestController
public class Servicemapping {

	@Autowired
	ProductService psev;
	
	@GetMapping("/get")
	public List<Product> productlist(){
		return psev.getProduct();
	}
	
	@PostMapping("/add")
	public void saveProduct(@RequestBody Product product) {
		psev.addProduct(product);
	}
	
	@GetMapping("/name")
		public List<Product> getname(){
			return psev.getname();
		}
	
	
}

