package com.etiya.customerservice.service;

import com.etiya.customerservice.dto.individualcustomer.IndCustCreateRequestDto;
import com.etiya.customerservice.dto.individualcustomer.IndCustCreateResponseDto;
import com.etiya.customerservice.entity.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerService {

    List<IndividualCustomer> getAll();
    IndividualCustomer getById(Long id);

    IndCustCreateResponseDto add(IndCustCreateRequestDto customer);

    void delete(Long id);
}
