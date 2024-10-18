package com.etiya.productservice.service.dto.responses.productSpecification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductSpecificationResponseDto {
    private Long id;
    private Long productId;
    private Long attributeValueId;
}
