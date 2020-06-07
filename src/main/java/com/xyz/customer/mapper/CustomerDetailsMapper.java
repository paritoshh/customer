package com.xyz.customer.mapper;

import com.xyz.customer.entity.CustomerEntity;
import com.xyz.customer.model.CustomerDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetailsMapper {

    public CustomerDetails mapCustomerEntityToCustomerDetails(CustomerEntity entity){
        return CustomerDetails.builder()
                .customerEmail(entity.getCustomerEmail())
                .customerName(entity.getCustomerName())
                .customerId(entity.getCustomerId())
                .mobileNumber(entity.getMobileNumber())
                .notificationPreference(entity.getNotificationPreference())
                .build();
    }
}
