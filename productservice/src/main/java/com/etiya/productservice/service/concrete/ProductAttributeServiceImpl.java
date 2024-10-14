package com.etiya.productservice.service.concrete;

import com.etiya.productservice.dto.request.productAttributeRequests.CreateProductAttributeRequestDto;
import com.etiya.productservice.dto.request.productAttributeRequests.UpdateProductAttributeRequestDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.CreateProductAttributeResponseDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.GetByIdProductAttributeResponseDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.ListProductAttributeResponseDto;
import com.etiya.productservice.dto.responses.productAttributeResponses.UpdateProductAttributeResponseDto;
import com.etiya.productservice.mapper.ProductAttributeMapper;
import com.etiya.productservice.repository.ProductAttributeRepository;
import com.etiya.productservice.service.abstracts.ProductAttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.etiya.productservice.entity.ProductAttribute;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductAttributeServiceImpl implements ProductAttributeService {

    private final ProductAttributeRepository productAttributeRepository;

    @Override
    public List<ListProductAttributeResponseDto> getAll() {
        List<ProductAttribute> productAttributes = productAttributeRepository.findAll();
        return ProductAttributeMapper.INSTANCE.productAttributeList(productAttributes);
    }

    @Override
    public GetByIdProductAttributeResponseDto getById(Long id) {
        ProductAttribute productAttribute = productAttributeRepository.findById(id).orElseThrow();
        return ProductAttributeMapper.INSTANCE.getByIdProductAttributeResponseDtoFromProductAttribute(productAttribute);
    }

    @Override
    public CreateProductAttributeResponseDto add(CreateProductAttributeRequestDto createProductAttributeRequestDto) {
        ProductAttribute productAttribute = ProductAttributeMapper.INSTANCE.productAttributeFromCreateProductAttributeRequestDto(createProductAttributeRequestDto);
        ProductAttribute addedProductAttribute = productAttributeRepository.save(productAttribute);
        return ProductAttributeMapper.INSTANCE.createProductAttributeResponseDtoFromProductAttribute(addedProductAttribute);
    }

    @Override
    public void delete(Long id) {
        productAttributeRepository.deleteById(id);
    }

    @Override
    public UpdateProductAttributeResponseDto update(Long id, UpdateProductAttributeRequestDto updateProductAttributeRequestDto) {
        ProductAttribute productAttribute = ProductAttributeMapper.INSTANCE.productAttributeFromUpdateProductAttributeRequestDto(updateProductAttributeRequestDto);
        productAttribute.setId(id);
        ProductAttribute updatedProductAttribute = productAttributeRepository.save(productAttribute);
        return ProductAttributeMapper.INSTANCE.updateProductAttributeResponseDtoFromProductAttribute(updatedProductAttribute);
    }
}
