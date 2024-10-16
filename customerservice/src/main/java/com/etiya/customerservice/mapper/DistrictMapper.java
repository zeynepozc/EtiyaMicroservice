package com.etiya.customerservice.mapper;

import com.etiya.customerservice.entity.District;
import com.etiya.customerservice.service.dto.request.district.CreateDistrictRequestDto;
import com.etiya.customerservice.service.dto.request.district.UpdateDistrictRequestDto;
import com.etiya.customerservice.service.dto.response.district.CreateDistrictResponseDto;
import com.etiya.customerservice.service.dto.response.district.GetByIdDistrictResponseDto;
import com.etiya.customerservice.service.dto.response.district.ListDistrictResponseDto;
import com.etiya.customerservice.service.dto.response.district.UpdateDistrictResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class DistrictMapper {

    @Mapping(source="city", target = "city.name")
    public abstract District districtFromCreateDistrictRequestDto(CreateDistrictRequestDto dto);

    public abstract District districtFromUpdateDistrictRequestDto(UpdateDistrictRequestDto dto);

    public abstract CreateDistrictResponseDto createDistrictResponseDtoFromDistrict(District district);

    public abstract GetByIdDistrictResponseDto getByIdDistrictResponseDtoFromDistrict(District district);

    public abstract UpdateDistrictResponseDto updateDistrictResponseDtoFromDistrict(District district);

    public abstract List<ListDistrictResponseDto> listDistrictResponseDtoListFromDistrictList(List<District> districtList);

}
