package com.org.SpringbootExercise1.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.SpringbootExercise1.Entity.Customer;
import com.org.SpringbootExercise1.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public Customer addCustomer(Customer cust) {
		
		Customer c=repo.save(cust);
		return c;
	}
	
	public List<Customer> fetchAllCustomer(){
		
		List<Customer> list=new ArrayList<Customer>();
		
		list=repo.findAll();
		return list;
	}
	
	public Customer fetchCustomerById(int id) {
		
		Optional<Customer> option= repo.findById(id);
		if(option.isPresent())
			return option.get();
		else
			return null;
	}
	
	public Customer updateCustomer(int id, String name, LocalDate dob) {
		
		Customer c= fetchCustomerById(id);
		if(c!=null) {
			c.setName(name);
			c.setDob(dob);
			return repo.save(c);
		}
		else
			return null;
	}
	
	public List<Customer> deleteCustomer(int id) {
		
		repo.deleteById(id);
		List<Customer> list=fetchAllCustomer();
		return list;
	}
}
