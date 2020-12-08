package com.org.SpringbootExercise1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.SpringbootExercise1.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
