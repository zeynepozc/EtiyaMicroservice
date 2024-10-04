package com.etiya.productservice.service;


import com.etiya.productservice.dto.CreateProductRequestDto;
import com.etiya.productservice.dto.CreateProductResponseDto;
import com.etiya.productservice.dto.ListProductResponseDto;
import java.util.List;

public interface ProductService {
    List<ListProductResponseDto> getAll();
    //GetByIdProductResponseDto getById(int id);
    CreateProductResponseDto add(CreateProductRequestDto createProductRequestDto);

}
