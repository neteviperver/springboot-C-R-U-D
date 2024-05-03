package com.ramazonaldo.springbootCRUD.controller;

import com.ramazonaldo.springbootCRUD.entitiy.Customer;
import com.ramazonaldo.springbootCRUD.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer addedCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<Customer>(addedCustomer, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") long id) {
        Customer customer = customerService.getCustomerById(id);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("id") long id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
