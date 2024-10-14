package com.etiya.productservice.service.concrete;

import com.etiya.productservice.dto.responses.offerResponses.*;
import com.etiya.productservice.dto.request.offerRequest.*;
import com.etiya.productservice.entity.Offer;
import com.etiya.productservice.mapper.OfferMapper;
import com.etiya.productservice.repository.OfferRepository;
import com.etiya.productservice.service.abstracts.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    @Override
    public GetByIdOfferResponseDto getById(Long id) {
        Offer offer = offerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Offer not found with id: " + id));
        return OfferMapper.INSTANCE.getByIdOfferResponseDtoFromOffer(offer);
    }
    @Override
    public List<ListOfferResponseDto> getAll() {
        List<Offer> offers = offerRepository.findAll();
        return OfferMapper.INSTANCE.offerList(offers);
    }

    @Override
    public CreateOfferResponseDto add(CreateOfferRequestDto createOfferRequestDto) {
        Offer offer = OfferMapper.INSTANCE.offerFromCreateOfferRequestDto(createOfferRequestDto);
        Offer addedOffer = offerRepository.save(offer);
        return OfferMapper.INSTANCE.createOfferResponseDtoFromOffer(addedOffer);
    }

    @Override
    public UpdateOfferResponseDto update(UpdateOfferRequestDto updateOfferRequestDto) {
        Offer offer = OfferMapper.INSTANCE.offerFromUpdateOfferRequestDto(updateOfferRequestDto);
        offer.setId(updateOfferRequestDto.getId());
        Offer updatedOffer = offerRepository.save(offer);
        return OfferMapper.INSTANCE.updateOfferResponseDtoFromOffer(updatedOffer);
    }

    @Override
    public void delete(Long id) {
        offerRepository.deleteById(id);
    }

    @Override
    public List<ListOfferResponseDto> search(List<Long> ids) {
        List<Offer> offers = offerRepository.findAllById(ids);
        return OfferMapper.INSTANCE.offerList(offers);
    }
}

