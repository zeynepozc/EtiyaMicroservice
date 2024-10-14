package com.etiya.customerservice.service.concrete;

import com.etiya.customerservice.service.abstracts.IndividualCustomerService;
import com.etiya.customerservice.service.dto.request.individualCustomer.IndCustCreateRequestDto;
import com.etiya.customerservice.service.dto.response.individualCustomer.IndCustCreateResponseDto;
import com.etiya.customerservice.entity.IndividualCustomer;
import com.etiya.customerservice.mapper.IndividualCustomerMapper;
import com.etiya.customerservice.repository.IndividualCustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IndividualCustomerServiceImpl implements IndividualCustomerService
{
    private final IndividualCustomerRepository individualCustomerRepository;

    @Override
    public List<IndividualCustomer> getAll() {
        return individualCustomerRepository.findAll();
    }

    @Override
    public IndividualCustomer getById(Long id) {
        return individualCustomerRepository.findById(id).orElseThrow();
    }

    @Override
    public IndCustCreateResponseDto add(IndCustCreateRequestDto customer) {
        IndividualCustomer _customer = IndividualCustomerMapper.INSTANCE.indCustFromCreateDto(customer);
        return IndividualCustomerMapper.INSTANCE.indCustCreateResponse(individualCustomerRepository.save(_customer));
    }

    @Override
    public void delete(Long id) {
        IndividualCustomer individualCustomer = individualCustomerRepository.findById(id).get();
        individualCustomer.setDeletedDate(LocalDateTime.now());
        individualCustomerRepository.save(individualCustomer);
    }


}
