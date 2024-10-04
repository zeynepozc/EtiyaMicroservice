package com.etiya.customerservice.service;

import com.etiya.customerservice.entity.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerService {

    List<IndividualCustomer> getAll();
    IndividualCustomer getById(Long id);

    IndividualCustomer add(IndividualCustomer customer);

    void delete(Long id);
}
