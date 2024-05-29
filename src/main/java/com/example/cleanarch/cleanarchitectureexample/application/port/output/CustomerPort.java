package com.example.cleanarch.cleanarchitectureexample.application.port.output;

import java.util.Optional;

import com.example.cleanarch.cleanarchitectureexample.domain.Customer;

public interface CustomerPort {
    
    void createCustomer(Customer customer);

    Optional<Customer> getCustomerById(Long id);

}
