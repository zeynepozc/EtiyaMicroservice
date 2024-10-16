package com.etiya.productservice.service.abstracts;


import com.etiya.productservice.service.dto.request.product.CreateProductRequestDto;
import com.etiya.productservice.service.dto.responses.product.CreateProductResponseDto;
import com.etiya.productservice.service.dto.responses.product.ListProductResponseDto;

import java.util.List;

public interface ProductService {
    List<ListProductResponseDto> getAll();
    //GetByIdProductResponseDto getById(int id);
    CreateProductResponseDto add(CreateProductRequestDto createProductRequestDto);
    List<ListProductResponseDto> search(List<Long> ids);
}
