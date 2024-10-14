package com.etiya.productservice.service.abstracts;


import com.etiya.productservice.dto.request.offerRequest.*;
import com.etiya.productservice.dto.responses.offerResponses.*;

import java.util.List;

public interface OfferService {
    List<ListOfferResponseDto> getAll();
    GetByIdOfferResponseDto getById(Long id);
    CreateOfferResponseDto add(CreateOfferRequestDto createOfferRequestDTO);
    UpdateOfferResponseDto update(UpdateOfferRequestDto updateOfferRequestDTO);
    void delete(Long id);
    List<ListOfferResponseDto> search(List<Long> ids);
}

