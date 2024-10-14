package com.etiya.productservice.controller;
import com.etiya.productservice.dto.responses.offerResponses.*;
import com.etiya.productservice.dto.request.offerRequest.*;
import com.etiya.productservice.service.abstracts.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
@RequiredArgsConstructor
public class OffersController {

    private final OfferService offerService;

    @GetMapping
    public List<ListOfferResponseDto> getAll() {
        return offerService.getAll();
    }

    @PostMapping("search")
    public List<ListOfferResponseDto> getByIds(@RequestBody List<Long> ids) {
        return offerService.search(ids);
    }

    @PostMapping
    public ResponseEntity<CreateOfferResponseDto> add(@RequestBody @Validated CreateOfferRequestDto createOfferRequestDto) {
        CreateOfferResponseDto createOfferResponseDTO = offerService.add(createOfferRequestDto);

        if (createOfferResponseDTO != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createOfferResponseDTO);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdateOfferResponseDto> update(@PathVariable Long id, @RequestBody @Validated UpdateOfferRequestDto updateOfferRequestDTO) {
        UpdateOfferResponseDto updateOfferResponseDto = offerService.update(updateOfferRequestDTO);

        return ResponseEntity.ok(updateOfferResponseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        GetByIdOfferResponseDto productAttribute = offerService.getById(id);

        if (productAttribute != null) {
            offerService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
