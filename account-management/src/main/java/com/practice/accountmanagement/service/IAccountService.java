package com.practice.accountmanagement.service;

import com.practice.accountmanagement.domain.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);
}
