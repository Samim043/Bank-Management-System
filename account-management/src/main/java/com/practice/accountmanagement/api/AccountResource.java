package com.practice.accountmanagement.api;

import com.practice.accountmanagement.domain.constants.AccountsConstants;
import com.practice.accountmanagement.domain.dto.AccountsDto;
import com.practice.accountmanagement.domain.dto.CustomerDto;
import com.practice.accountmanagement.domain.dto.ResponseDto;
import com.practice.accountmanagement.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountResource {

    private final IAccountService iAccountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){

        iAccountService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
