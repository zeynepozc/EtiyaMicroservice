package com.etiya.customerservice.service.abstracts;

import com.etiya.customerservice.service.dto.request.individualCustomer.IndCustCreateRequestDto;
import com.etiya.customerservice.service.dto.response.individualCustomer.IndCustCreateResponseDto;
import com.etiya.customerservice.entity.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerService {

    List<IndividualCustomer> getAll();
    IndividualCustomer getById(Long id);

    IndCustCreateResponseDto add(IndCustCreateRequestDto customer);

    void delete(Long id);
}
