package com.xyz.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "CUSTOMER_ID")
    private String customerId;

    @Column(name = "NAME")
    private String customerName;

    @Column(name = "EMAIL")
    private String customerEmail;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "NOTIFICATION_PREFERENCE")
    private String notificationPreference;
}
