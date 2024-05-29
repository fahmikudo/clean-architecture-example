package com.example.cleanarch.cleanarchitectureexample.infrastructure.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    
}
