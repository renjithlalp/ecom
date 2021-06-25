package com.gama.ecom.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gama.ecom.entities.Customer;

@Repository
public interface CustomerRepository extends 	CrudRepository<Customer, String> {

}
