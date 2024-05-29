package com.example.cleanarch.cleanarchitectureexample.application.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCustomerRequest {
    
    private String name;
    private String phoneNumber;

}
