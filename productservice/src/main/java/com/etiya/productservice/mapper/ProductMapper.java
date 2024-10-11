package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.CreateProductResponseDto;
import com.etiya.productservice.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import java.util.List;
import com.etiya.productservice.dto.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper // bağımlılık enjeksiyonu
{
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source="categoryId", target = "category.id")
    Product productFromCreateDto(CreateProductRequestDto dto);
    CreateProductResponseDto createProductResponseDtoFromProduct(Product product);
    List<ListProductResponseDto> productFromListDto(List<Product> dto);

}
