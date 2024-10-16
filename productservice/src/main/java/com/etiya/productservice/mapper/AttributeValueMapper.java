package com.etiya.productservice.mapper;

import com.etiya.productservice.service.dto.request.attributeValue.CreateAttributeValueRequestDto;
import com.etiya.productservice.service.dto.request.attributeValue.UpdateAttributeValueRequestDto;
import com.etiya.productservice.service.dto.responses.attributeValue.CreateAttributeValueResponseDto;
import com.etiya.productservice.service.dto.responses.attributeValue.GetByIdAttributeValueResponseDto;
import com.etiya.productservice.service.dto.responses.attributeValue.ListAttributeValueResponseDto;
import com.etiya.productservice.service.dto.responses.attributeValue.UpdateAttributeValueResponseDto;
import com.etiya.productservice.entity.AttributeValue;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface AttributeValueMapper {
    AttributeValueMapper INSTANCE = Mappers.getMapper(AttributeValueMapper.class);
    @Mapping(source="attributeId", target = "productAttribute.id")
    AttributeValue attributeValueFromCreateAttributeValueRequestDto(CreateAttributeValueRequestDto createAttributeValueRequestDto);
    @Mapping(source = "productAttribute.id", target="attributeId")
    CreateAttributeValueResponseDto createAttributeValueResponseDtoFromAttributeValue(AttributeValue attributeValue);
    @Mapping(source="attributeId", target = "productAttribute.id")
    AttributeValue attributeValueFromUpdateAttributeValueRequestDto(UpdateAttributeValueRequestDto updateAttributeValueRequestDto);
    @Mapping(source = "productAttribute.id", target="attributeId")
    UpdateAttributeValueResponseDto updateAttributeValueResponseDtoFromAttributeValue(AttributeValue attributeValue);
    @Mapping(source = "productAttribute.id", target="attributeId")
    List<ListAttributeValueResponseDto> attributeValueList(List<AttributeValue> attributeValueList);
    @Mapping(source = "productAttribute.id", target="attributeId")
    ListAttributeValueResponseDto attributeValueList(AttributeValue attributeValue);
    GetByIdAttributeValueResponseDto getByIdAttributeValueResponseDtoFromAttributeValue(AttributeValue attributeValue);
}
