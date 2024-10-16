package com.etiya.productservice.service.concrete;

import com.etiya.productservice.entity.AttributeValue;
import com.etiya.productservice.mapper.AttributeValueMapper;
import com.etiya.productservice.repository.AttributeValueRepository;
import com.etiya.productservice.service.abstracts.AttributeValueService;
import com.etiya.productservice.service.dto.request.attributeValue.CreateAttributeValueRequestDto;
import com.etiya.productservice.service.dto.request.attributeValue.UpdateAttributeValueRequestDto;
import com.etiya.productservice.service.dto.responses.attributeValue.CreateAttributeValueResponseDto;
import com.etiya.productservice.service.dto.responses.attributeValue.GetByIdAttributeValueResponseDto;
import com.etiya.productservice.service.dto.responses.attributeValue.ListAttributeValueResponseDto;
import com.etiya.productservice.service.dto.responses.attributeValue.UpdateAttributeValueResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AttributeValueServiceImpl implements AttributeValueService {
    private final AttributeValueRepository attributeValueRepository;

    @Override
    public List<ListAttributeValueResponseDto> getAll() {
        List<AttributeValue> attributeValues = attributeValueRepository.findAll();
        return AttributeValueMapper.INSTANCE.attributeValueList(attributeValues);
    }

    @Override
    public GetByIdAttributeValueResponseDto getById(Long id) {
        AttributeValue attributeValue = attributeValueRepository.findById(id).orElseThrow();
        return AttributeValueMapper.INSTANCE.getByIdAttributeValueResponseDtoFromAttributeValue(attributeValue);
    }

    @Override
    public CreateAttributeValueResponseDto add(CreateAttributeValueRequestDto createAttributeValueRequestDto) {
        AttributeValue attributeValue = AttributeValueMapper.INSTANCE.attributeValueFromCreateAttributeValueRequestDto(createAttributeValueRequestDto);
        attributeValue.setActive(true);
        AttributeValue addedAttributeValue = attributeValueRepository.save(attributeValue);
        return AttributeValueMapper.INSTANCE.createAttributeValueResponseDtoFromAttributeValue(addedAttributeValue);
    }

    @Override
    public void delete(Long id) {
        attributeValueRepository.deleteById(id);
    }

    @Override
    public UpdateAttributeValueResponseDto update(Long id, UpdateAttributeValueRequestDto updateAttributeValueRequestDto) {
        AttributeValue attributeValue = AttributeValueMapper.INSTANCE.attributeValueFromUpdateAttributeValueRequestDto(updateAttributeValueRequestDto);
        attributeValue.setId(id);
        AttributeValue updatedAttributeValue = attributeValueRepository.save(attributeValue);
        return AttributeValueMapper.INSTANCE.updateAttributeValueResponseDtoFromAttributeValue(updatedAttributeValue);
    }
}
