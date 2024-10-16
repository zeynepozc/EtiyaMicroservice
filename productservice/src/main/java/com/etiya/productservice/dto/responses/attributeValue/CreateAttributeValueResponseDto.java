package com.etiya.productservice.dto.responses.attributeValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAttributeValueResponseDto {
    private Long id;
    private int attributeId;
    private String value;
    private boolean isActive;
}
