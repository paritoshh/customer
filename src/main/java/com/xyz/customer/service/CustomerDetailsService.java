package com.xyz.customer.service;

import com.xyz.customer.model.CustomerDetails;

public interface CustomerDetailsService {

    CustomerDetails getCustomerDetails(String customerId);
}
