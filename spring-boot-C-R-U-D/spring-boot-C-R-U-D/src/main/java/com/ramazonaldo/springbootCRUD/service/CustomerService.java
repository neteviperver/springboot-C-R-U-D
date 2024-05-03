package com.ramazonaldo.springbootCRUD.service;

import com.ramazonaldo.springbootCRUD.entitiy.Customer;
import com.ramazonaldo.springbootCRUD.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public  Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Customer getCustomerById(long customerid) {
        return customerRepository.findById(customerid).get();
    }
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
}
