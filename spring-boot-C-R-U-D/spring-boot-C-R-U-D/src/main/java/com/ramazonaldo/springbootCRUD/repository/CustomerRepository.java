package com.ramazonaldo.springbootCRUD.repository;

import com.ramazonaldo.springbootCRUD.entitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
