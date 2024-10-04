package com.etiya.customerservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerAccountMapper {
    CustomerAccountMapper INSTANCE = Mappers.getMapper(CustomerAccountMapper.class);

}