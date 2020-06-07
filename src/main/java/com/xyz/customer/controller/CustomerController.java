package com.xyz.customer.controller;

import com.xyz.customer.model.CustomerDetails;
import com.xyz.customer.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerDetailsService customerDetailsService;

    @GetMapping("/customerId/{customerId}")
    public ResponseEntity<CustomerDetails> retrieveCustomer(@PathVariable String customerId){
        CustomerDetails customerDetails = customerDetailsService.getCustomerDetails(customerId);
        return new ResponseEntity<>(customerDetails, HttpStatus.OK);
    }
}
