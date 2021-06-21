package com.gama.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gama.ecom.entities.Product;
import com.gama.ecom.repo.ProductRepository;

@RestController
@RequestMapping("/rest")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/allProducts")
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<>();
		productRepo.findAll().forEach(list::add);
		return list;
		
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		productRepo.save(product);
		return product;
	}

}
