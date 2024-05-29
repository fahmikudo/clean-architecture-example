package com.example.cleanarch.cleanarchitectureexample.application.port.input;

import com.example.cleanarch.cleanarchitectureexample.application.model.request.CreateCustomerRequest;
import com.example.cleanarch.cleanarchitectureexample.application.model.response.CreateCustomerResponse;

public interface CreateCustomerUseCase {
    
    CreateCustomerResponse execute(CreateCustomerRequest request) throws Exception;

}
