package com.etiya.productservice.service;


import com.etiya.productservice.dto.CreateProductRequestDto;
import com.etiya.productservice.dto.CreateProductResponseDto;
import com.etiya.productservice.dto.ListProductResponseDto;
import com.etiya.productservice.entity.Product;

import java.util.List;

public interface ProductService {
    List<ListProductResponseDto> getAll();
    //GetByIdProductResponseDto getById(int id);
    CreateProductResponseDto add(CreateProductRequestDto createProductRequestDto);
    List<ListProductResponseDto> search(List<Long> ids);
}
