package com.etiya.customerservice.mapper;

import com.etiya.customerservice.dto.individualcustomer.CreateIndividualCustomerRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CorporateCustomerMapper {
    CorporateCustomerMapper INSTANCE = Mappers.getMapper(CorporateCustomerMapper.class);

    CorporateCustomerMapper customerFromCreateDto(CreateIndividualCustomerRequestDto dto);
    // CreateCorporateCustomerRequestDto

}