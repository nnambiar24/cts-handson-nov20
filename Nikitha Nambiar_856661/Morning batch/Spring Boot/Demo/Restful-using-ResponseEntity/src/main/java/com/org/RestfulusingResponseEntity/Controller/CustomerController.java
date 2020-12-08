package com.org.RestfulusingResponseEntity.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.RestfulusingResponseEntity.CustomerException.CustomerNotFoundException;
import com.org.RestfulusingResponseEntity.Entity.Customer;
import com.org.RestfulusingResponseEntity.Service.CustomerService;



@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerService serv;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer add(@RequestBody Customer c) {
		
		Customer customer=serv.addCustomer(c);
		return customer;
	}
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return serv.fetchAllCustomer();
	}
	
	@GetMapping(value="{customerId}")
	public ResponseEntity<Object> getCustomerById(@PathVariable("customerId")int id) {
		ResponseEntity<Object> response=null;
		try {
			Customer customer=serv.fetchCustomerById(id);
			response=ResponseEntity.status(200).body(customer);
		}
		catch(CustomerNotFoundException e) {
			response=ResponseEntity.status(404).body(e.getMessage());
		}
		
		return response;
	}
	
	@PutMapping(value="{id}/{name}/{dob}")
	public ResponseEntity<Object> update(@PathVariable("id")int id, @PathVariable("name")String name, @PathVariable("dob")String dob) {
		
		ResponseEntity response=null;
		try {
			Customer customer=serv.updateCustomer(id, name, LocalDate.parse(dob));
			response=ResponseEntity.status(200).body(customer);
		}
		catch(CustomerNotFoundException e) {
			response=ResponseEntity.status(404).body(e.getMessage());
		}
		
		return response;
	}
	
	@DeleteMapping(value="{id}")
	public List<Customer> delete(@PathVariable("id")int id){
		
		List<Customer>list=serv.deleteCustomer(id);
		return list;
	}
}

