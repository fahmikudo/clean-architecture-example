package com.example.cleanarch.cleanarchitectureexample.application.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCustomerResponse {

    private String name;
    private String phoneNumber;
    
}
