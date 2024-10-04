package com.etiya.customerservice.mapper;

import com.etiya.customerservice.dto.individualcustomer.CreateIndividualCustomerRequestDto;
import com.etiya.customerservice.dto.individualcustomer.CreateIndividualCustomerResponseDto;
import com.etiya.customerservice.entity.IndividualCustomer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IndividualCustomerMapper {
    IndividualCustomerMapper INSTANCE = Mappers.getMapper(IndividualCustomerMapper.class);

//    IndividualCustomer customerFromCreateDto(CreateIndividualCustomerRequestDto dto);
//    CreateIndividualCustomerResponseDto createIndividualCustomerResponseDtoFromIndividualCustomer(IndividualCustomer individualCustomer);
}