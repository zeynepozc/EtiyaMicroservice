package com.etiya.productservice.service.abstracts;

import com.etiya.productservice.dto.request.productAttributeRequests.CreateProductAttributeRequestDto;
import com.etiya.productservice.dto.request.productAttributeRequests.UpdateProductAttributeRequestDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.CreateProductAttributeResponseDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.GetByIdProductAttributeResponseDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.ListProductAttributeResponseDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.UpdateProductAttributeResponseDto;

import java.util.List;

public interface ProductAttributeService {
    List<ListProductAttributeResponseDto> getAll();
    GetByIdProductAttributeResponseDto getById(Long id);
    CreateProductAttributeResponseDto add(CreateProductAttributeRequestDto createProductAttributeRequestDto);
    void delete(Long id);
    UpdateProductAttributeResponseDto update(Long id, UpdateProductAttributeRequestDto updateProductAttributeRequestDto);
}
