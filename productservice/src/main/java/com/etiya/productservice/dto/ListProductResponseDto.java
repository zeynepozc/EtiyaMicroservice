package com.etiya.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListProductResponseDto {
    private Long id;
    private String name;
    private BigDecimal unitPrice;
    private String categoryName;
    private int stockQuantity;
}
