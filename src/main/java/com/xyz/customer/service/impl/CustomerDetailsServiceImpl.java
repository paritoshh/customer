package com.xyz.customer.service.impl;

import com.xyz.customer.entity.CustomerEntity;
import com.xyz.customer.exception.CustomerNotFoundException;
import com.xyz.customer.mapper.CustomerDetailsMapper;
import com.xyz.customer.model.CustomerDetails;
import com.xyz.customer.repository.CustomerDetailsRepository;
import com.xyz.customer.service.CustomerDetailsService;
import com.xyz.customer.utils.ErrorCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

    @Autowired
    CustomerDetailsRepository customerDetailsRepository;
    @Autowired
    CustomerDetailsMapper mapper;

    @Override
    public CustomerDetails getCustomerDetails(String customerId) {

        Optional<CustomerEntity> customerEntity = customerDetailsRepository.findByCustomerId(customerId);
        if(customerEntity.isPresent()){
            return mapper.mapCustomerEntityToCustomerDetails(customerEntity.get());
        }
        else{
            throw new CustomerNotFoundException("Customer not found for the given customer-id:" +customerId, ErrorCodes.CUSTOMER_NOT_FOUND);
        }
    }
}
