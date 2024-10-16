package com.etiya.productservice.mapper;

import com.etiya.productservice.entity.Campaign;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.etiya.productservice.service.dto.request.campaign.*;
import com.etiya.productservice.service.dto.responses.campaign.*;
import java.util.List;

@Mapper
public interface CampaignMapper {
    CampaignMapper INSTANCE = Mappers.getMapper(CampaignMapper.class);
    Campaign campaignFromCreateCampaignRequestDto(CreateCampaignRequestDto dto);
    CreateCampaignResponseDto createCampaignResponseDtoFromCampaign(Campaign campaign);
    Campaign campaignFromUpdateCampaignRequestDto(UpdateCampaignRequestDto dto);
    UpdateCampaignResponseDto updateCampaignResponseDtoFromCampaign(Campaign campaign);
    GetByIdCampaignResponseDto getByIdCampaignResponseDtoFromCampaign(Campaign campaign);
    List<ListCampaignResponseDto> campaignList(List<Campaign> campaigns);
}
