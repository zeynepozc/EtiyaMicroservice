package com.etiya.customerservice.mapper;

import com.etiya.customerservice.dto.individualcustomer.IndCustCreateRequestDto;
import com.etiya.customerservice.dto.individualcustomer.IndCustCreateResponseDto;
import com.etiya.customerservice.entity.IndividualCustomer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IndividualCustomerMapper {
    IndividualCustomerMapper INSTANCE = Mappers.getMapper(IndividualCustomerMapper.class);

    IndividualCustomer indCustFromCreateDto(IndCustCreateRequestDto dto);
    IndCustCreateResponseDto indCustCreateResponse(IndividualCustomer individualCustomer);
}