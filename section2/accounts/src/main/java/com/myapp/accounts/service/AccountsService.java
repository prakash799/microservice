package com.myapp.accounts.service;

import com.myapp.accounts.dto.CustomerDto;

public interface AccountsService {
    /**
     *
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccount(String mobileNumber);
}
