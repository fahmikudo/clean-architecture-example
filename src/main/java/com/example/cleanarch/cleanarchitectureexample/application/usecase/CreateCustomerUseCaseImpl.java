package com.example.cleanarch.cleanarchitectureexample.application.usecase;

import org.springframework.transaction.annotation.Transactional;

import com.example.cleanarch.cleanarchitectureexample.application.model.request.CreateCustomerRequest;
import com.example.cleanarch.cleanarchitectureexample.application.model.response.CreateCustomerResponse;
import com.example.cleanarch.cleanarchitectureexample.application.port.input.CreateCustomerUseCase;
import com.example.cleanarch.cleanarchitectureexample.application.port.output.CustomerPort;
import com.example.cleanarch.cleanarchitectureexample.domain.Customer;
import com.example.cleanarch.cleanarchitectureexample.stereotype.UseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@Transactional
@RequiredArgsConstructor
public class CreateCustomerUseCaseImpl implements CreateCustomerUseCase {

    private final CustomerPort customerPort;

    @Override
    public CreateCustomerResponse execute(CreateCustomerRequest request) throws Exception {
        // TODO Auto-generated method stub
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setPhoneNumber(request.getPhoneNumber());


        customerPort.createCustomer(customer);


        return new CreateCustomerResponse(customer.getName(), customer.getPhoneNumber());
    }
    
}
