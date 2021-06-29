package com.gama.dicovery.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "productService")
public interface ProductClient {
	
	@GetMapping("/allProducts")
	public List getAllProduct();
}
