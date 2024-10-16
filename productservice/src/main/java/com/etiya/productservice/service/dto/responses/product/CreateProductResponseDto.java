package com.etiya.productservice.service.dto.responses.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductResponseDto {
    private Long id;
    private String name;
    private int stockQuantity;
}
