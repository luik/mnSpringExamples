package com.milkneko.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milkneko.example.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
