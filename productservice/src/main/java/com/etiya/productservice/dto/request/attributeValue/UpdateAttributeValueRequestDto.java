package com.etiya.productservice.dto.request.attributeValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAttributeValueRequestDto {
    private int attributeId;
    private String value;
}
