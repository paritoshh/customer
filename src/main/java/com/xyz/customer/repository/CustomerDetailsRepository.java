package com.xyz.customer.repository;

import com.xyz.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerEntity, Long> {

    Optional<CustomerEntity> findByCustomerId(String customerId);
}
