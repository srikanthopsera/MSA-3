package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
