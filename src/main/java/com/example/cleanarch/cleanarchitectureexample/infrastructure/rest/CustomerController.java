package com.example.cleanarch.cleanarchitectureexample.infrastructure.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cleanarch.cleanarchitectureexample.application.model.request.CreateCustomerRequest;
import com.example.cleanarch.cleanarchitectureexample.application.model.response.CreateCustomerResponse;
import com.example.cleanarch.cleanarchitectureexample.application.port.input.CreateCustomerUseCase;
import com.example.cleanarch.cleanarchitectureexample.stereotype.WebAdapter;

import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CustomerController {
    
    private final CreateCustomerUseCase createCustomerUseCase;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateCustomerResponse> createCustomer(@RequestBody CreateCustomerRequest request) throws Exception {
        CreateCustomerResponse response = createCustomerUseCase.execute(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
