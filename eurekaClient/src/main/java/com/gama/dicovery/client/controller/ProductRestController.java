package com.gama.dicovery.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ProductRestController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RestTemplate restTemlate;
	
	@GetMapping("/allProducts")
	public ResponseEntity<List> getAllProduct() {
		
		String service = discoveryClient.getInstances("productService").get(0).getUri()+"/rest/allProducts";
		ResponseEntity<List> response =restTemlate.getForEntity(service, List.class);
		return response;
	}
	
	

}
