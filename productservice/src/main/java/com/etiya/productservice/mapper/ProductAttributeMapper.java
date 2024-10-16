package com.etiya.productservice.mapper;

import com.etiya.productservice.service.dto.request.productAttribute.CreateProductAttributeRequestDto;
import com.etiya.productservice.service.dto.request.productAttribute.UpdateProductAttributeRequestDto;
import com.etiya.productservice.service.dto.responses.productAttribute.CreateProductAttributeResponseDto;
import com.etiya.productservice.service.dto.responses.productAttribute.GetByIdProductAttributeResponseDto;
import com.etiya.productservice.service.dto.responses.productAttribute.ListProductAttributeResponseDto;
import com.etiya.productservice.service.dto.responses.productAttribute.UpdateProductAttributeResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.etiya.productservice.entity.ProductAttribute;

import java.util.List;

@Mapper
public interface ProductAttributeMapper {
    ProductAttributeMapper INSTANCE = Mappers.getMapper(ProductAttributeMapper.class);

    ProductAttribute productAttributeFromCreateProductAttributeRequestDto(CreateProductAttributeRequestDto createProductAttributeRequestDto);
    CreateProductAttributeResponseDto createProductAttributeResponseDtoFromProductAttribute(ProductAttribute productAttribute);
    ProductAttribute productAttributeFromUpdateProductAttributeRequestDto(UpdateProductAttributeRequestDto updateProductAttributeRequestDto);
    UpdateProductAttributeResponseDto updateProductAttributeResponseDtoFromProductAttribute(ProductAttribute productAttribute);
    List<ListProductAttributeResponseDto> productAttributeList(List<ProductAttribute> productAttributeList);
    GetByIdProductAttributeResponseDto getByIdProductAttributeResponseDtoFromProductAttribute(ProductAttribute productAttribute);
}
