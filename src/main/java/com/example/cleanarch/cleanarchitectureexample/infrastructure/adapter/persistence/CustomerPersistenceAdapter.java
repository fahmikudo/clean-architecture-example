package com.example.cleanarch.cleanarchitectureexample.infrastructure.adapter.persistence;

import java.util.Optional;

import com.example.cleanarch.cleanarchitectureexample.application.port.output.CustomerPort;
import com.example.cleanarch.cleanarchitectureexample.domain.Customer;
import com.example.cleanarch.cleanarchitectureexample.stereotype.PersistenceAdapter;

import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class CustomerPersistenceAdapter implements CustomerPort {

    private final CustomerRepository customerRepository;

    @Override
    public void createCustomer(Customer customer) {
        CustomerEntity entity = CustomerMapper.mapToCustomerEntity(customer);
        customerRepository.save(entity);
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        Optional<CustomerEntity> customerEntity = Optional.ofNullable(customerRepository.findById(id).orElseThrow());
        return customerEntity.map(CustomerMapper::mapToCustomer);
    }
    
}
