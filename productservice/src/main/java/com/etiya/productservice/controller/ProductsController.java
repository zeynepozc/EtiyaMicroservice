package com.etiya.productservice.controller;

import com.etiya.productservice.dto.CreateProductRequestDto;
import com.etiya.productservice.dto.CreateProductResponseDto;
import com.etiya.productservice.dto.ListProductResponseDto;
import com.etiya.productservice.entity.Product;
import com.etiya.productservice.service.ProductService;
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
  //@GetMapping
  public String get() {
    System.out.println("Hello from product service");
    return "Hello from product service";
  }

  @GetMapping
  public List<ListProductResponseDto> getAll(){
    return productService.getAll();
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

  @PostMapping("search")
  public List<ListProductResponseDto> getByIds(@RequestBody List<Long> ids)
  {
    return productService.search(ids);
  }
}
