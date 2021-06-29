package com.gama.dicovery.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gama.dicovery.client.ProductClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ProductRestController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private RestTemplate restTemlate;
	
	@Autowired
	private ProductClient productClient;

	@GetMapping("/allProducts")
	@CircuitBreaker(name = "productAllC", fallbackMethod = "productAllFallBack")
	public ResponseEntity<List> getAllProduct() {

		String service = discoveryClient.getInstances("productService").get(0).getUri() + "/rest/allProducts";
		ResponseEntity<List> response = restTemlate.getForEntity(service, List.class);
		return response;
	}
	
	@GetMapping("/products")
	@CircuitBreaker(name = "productsC", fallbackMethod = "productAllFallBack")
	public List getProducts() {
		return productClient.getAllProduct();
	}

	public ResponseEntity<List> productAllFallBack(Throwable t) {
		List<String> fals = new ArrayList<>();
		fals.add("Sorry for inconvenience....");
		ResponseEntity res = new ResponseEntity(fals,HttpStatus.OK);
		return res;
	}

}
