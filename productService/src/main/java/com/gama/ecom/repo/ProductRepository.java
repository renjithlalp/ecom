package com.gama.ecom.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gama.ecom.entities.Product;

@Repository
public interface ProductRepository extends 	CrudRepository<Product, String> {

}
