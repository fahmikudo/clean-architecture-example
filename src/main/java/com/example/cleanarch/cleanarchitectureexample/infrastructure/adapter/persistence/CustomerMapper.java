package com.example.cleanarch.cleanarchitectureexample.infrastructure.adapter.persistence;

import com.example.cleanarch.cleanarchitectureexample.domain.Customer;

public class CustomerMapper {

    public static Customer mapToCustomer(CustomerEntity customerEntity) {
        return new Customer(customerEntity.getId(), customerEntity.getName(), customerEntity.getPhoneNumber());
    }

    public static CustomerEntity mapToCustomerEntity(Customer customer) {
        return new CustomerEntity(customer.getId(), customer.getName(), customer.getPhoneNumber());
    }
    
}
