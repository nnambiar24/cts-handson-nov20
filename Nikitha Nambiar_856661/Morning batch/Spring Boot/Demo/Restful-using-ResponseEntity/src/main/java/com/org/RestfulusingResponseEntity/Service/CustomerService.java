package com.org.RestfulusingResponseEntity.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.RestfulusingResponseEntity.CustomerException.CustomerNotFoundException;
import com.org.RestfulusingResponseEntity.Entity.Customer;
import com.org.RestfulusingResponseEntity.Repository.CustomerRepository;



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
	
	public Customer fetchCustomerById(int id) throws CustomerNotFoundException{
		
		Optional<Customer> option= repo.findById(id);
		if(option.isPresent())
			return option.get();
		else
			throw new CustomerNotFoundException("customer with id "+id+" not found");
	}
	
	public Customer updateCustomer(int id, String name, LocalDate dob) throws CustomerNotFoundException{
		
		Customer c= fetchCustomerById(id);
		
			c.setName(name);
			c.setDob(dob);
			return repo.save(c);

		
	}
	
	public List<Customer> deleteCustomer(int id) {
		
		repo.deleteById(id);
		List<Customer> list=fetchAllCustomer();
		return list;
	}
}

