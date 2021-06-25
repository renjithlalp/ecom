package com.gama.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gama.ecom.entities.Customer;
import com.gama.ecom.repo.CustomerRepository;
import com.gama.ecom.vo.CustomerVO;

@RestController
@RequestMapping("/rest")
public class CustomerController {
	
	@Autowired
	private CustomerRepository CustomerRepo;
	
	@GetMapping("/allCustomers")
	public List<CustomerVO> getAllCustomer() {
		List<CustomerVO> list = new ArrayList<>();
		CustomerRepo.findAll().forEach((cu) ->{
			CustomerVO customerVO = new CustomerVO();
			customerVO.setCustomer_id(cu.getCustomer_id());
			customerVO.setFirstName(cu.getFirstName());
			customerVO.setLastName(cu.getLastName());
			customerVO.setEmail(cu.getEmail());
			list.add(customerVO);;
		});
		return list;
	}
	
	@PostMapping("/addCustomer")
	public CustomerVO addCustomer(@RequestBody CustomerVO customer) {
		Customer cu = new Customer();
		cu.setCustomer_id(cu.getCustomer_id());
		cu.setFirstName(cu.getFirstName());
		cu.setLastName(cu.getLastName());
		cu.setEmail(cu.getEmail());
		CustomerRepo.save(cu);
		return customer;
	}

}
