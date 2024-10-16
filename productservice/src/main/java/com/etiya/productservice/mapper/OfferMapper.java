package com.etiya.productservice.mapper;
import com.etiya.productservice.entity.Offer;
import com.etiya.productservice.service.dto.request.offer.CreateOfferRequestDto;
import com.etiya.productservice.service.dto.request.offer.UpdateOfferRequestDto;
import com.etiya.productservice.service.dto.responses.offer.CreateOfferResponseDto;
import com.etiya.productservice.service.dto.responses.offer.GetByIdOfferResponseDto;
import com.etiya.productservice.service.dto.responses.offer.ListOfferResponseDto;
import com.etiya.productservice.service.dto.responses.offer.UpdateOfferResponseDto;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper
public interface OfferMapper {
    OfferMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(OfferMapper.class);

    Offer offerFromCreateOfferRequestDto(CreateOfferRequestDto dto);

    CreateOfferResponseDto createOfferResponseDtoFromOffer(Offer offer);

    Offer offerFromUpdateOfferRequestDto(UpdateOfferRequestDto dto);

    UpdateOfferResponseDto updateOfferResponseDtoFromOffer(Offer offer);
    GetByIdOfferResponseDto getByIdOfferResponseDtoFromOffer(Offer offer);
    List<ListOfferResponseDto> offerList(List<Offer> offers);
}

