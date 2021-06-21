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
import com.gama.ecom.vo.ProductVO;

@RestController
@RequestMapping("/rest")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/allProducts")
	public List<ProductVO> getAllProduct() {
		List<ProductVO> list = new ArrayList<>();
		productRepo.findAll().forEach((pr) ->{
			ProductVO productVO = new ProductVO();
			productVO.setProductId(pr.getProductId());
			productVO.setProductName(pr.getProductName());
			productVO.setPricePerUnit(pr.getPricePerUnit());
			productVO.setBasicUnit(pr.getBasicUnit());
			productVO.setTax(pr.getTax());
			productVO.setActive(pr.isActive());
			list.add(productVO);;
		});
		return list;
	}
	
	@PostMapping("/addProduct")
	public ProductVO addProduct(@RequestBody ProductVO product) {
		Product pr = new Product();
		pr.setProductId(product.getProductId());
		pr.setProductName(product.getProductName());
		pr.setPricePerUnit(product.getPricePerUnit());
		pr.setBasicUnit(product.getBasicUnit());
		pr.setTax(product.getTax());
		pr.setActive(product.isActive());
		productRepo.save(pr);
		return product;
	}

}
