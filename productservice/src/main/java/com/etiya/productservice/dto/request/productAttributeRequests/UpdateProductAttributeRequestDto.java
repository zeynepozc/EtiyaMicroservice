package com.etiya.productservice.dto.request.productAttributeRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductAttributeRequestDto {
    private String name;
    private String dataType;
}
