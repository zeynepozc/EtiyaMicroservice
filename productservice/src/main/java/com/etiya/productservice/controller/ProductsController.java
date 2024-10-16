package com.etiya.productservice.controller;

import com.etiya.productservice.service.dto.request.product.CreateProductRequestDto;
import com.etiya.productservice.service.dto.responses.product.CreateProductResponseDto;
import com.etiya.productservice.service.dto.responses.product.ListProductResponseDto;
import com.etiya.productservice.service.abstracts.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {
  private final ProductService productService;
  @GetMapping
  public List<ListProductResponseDto> getAll(){
    return productService.getAll();
  }

  @PostMapping("search")
  public List<ListProductResponseDto> getByIds(@RequestBody List<Long> ids)
  {
    return productService.search(ids);
  }

  @PostMapping
  public ResponseEntity<CreateProductResponseDto> add(@RequestBody @Valid CreateProductRequestDto createProductRequestDto){
    CreateProductResponseDto createProductResponseDto = productService.add(createProductRequestDto);

    if (createProductResponseDto != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(createProductResponseDto);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
  }
}
