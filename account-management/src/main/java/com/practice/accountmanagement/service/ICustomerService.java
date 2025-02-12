package com.practice.accountmanagement.service;

import com.practice.accountmanagement.domain.dto.CustomerDetailsDto;

public interface ICustomerService {

    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
