package com.etiya.productservice.mapper;
import com.etiya.productservice.dto.request.offerRequest.*;
import com.etiya.productservice.dto.responses.offerResponses.*;
import com.etiya.productservice.entity.Offer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

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

