package com.etiya.customerservice.service.concrete;

import com.etiya.customerservice.mapper.CityMapper;
import com.etiya.customerservice.repository.CityRepository;
import com.etiya.customerservice.service.abstracts.CityService;
import com.etiya.customerservice.service.dto.request.city.CreateCityRequestDto;
import com.etiya.customerservice.service.dto.request.city.UpdateCityRequestDto;
import com.etiya.customerservice.service.dto.response.city.CreateCityResponseDto;
import com.etiya.customerservice.service.dto.response.city.GetByIdCityResponseDto;
import com.etiya.customerservice.service.dto.response.city.ListCityResponseDto;
import com.etiya.customerservice.service.dto.response.city.UpdateCityResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService
{
    private final CityRepository cityRepository;
    private final CityMapper cityMapper;


    @Override
    public List<ListCityResponseDto> getAll() {
        return null;
    }

    @Override
    public GetByIdCityResponseDto getById(Long id) {
        return null;
    }

    @Override
    public CreateCityResponseDto add(CreateCityRequestDto dto) {
        return null;
    }

    @Override
    public UpdateCityResponseDto update(UpdateCityRequestDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {
        cityRepository.deleteById(id);
    }
}
