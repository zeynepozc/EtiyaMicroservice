package com.etiya.productservice.service;

import com.etiya.productservice.dto.CreateProductRequestDto;
import com.etiya.productservice.dto.CreateProductResponseDto;
import com.etiya.productservice.dto.ListProductResponseDto;
import com.etiya.productservice.entity.Product;
import com.etiya.productservice.mapper.ProductMapper;
import com.etiya.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public List<ListProductResponseDto> getAll() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> {
                    return new ListProductResponseDto(product.getId(), product.getName(), product.getPrice(),product.getCategory().getName());
                }).toList();
    }

    @Override
    public CreateProductResponseDto add(CreateProductRequestDto createProductRequestDto) {
        Product product = ProductMapper.INSTANCE.productFromCreateDto(createProductRequestDto);
        Product addedProduct = productRepository.save(product);

        return ProductMapper.INSTANCE.createProductResponseDtoFromProduct(addedProduct);
    }

}
