package com.etiya.customerservice.controller;

import com.etiya.customerservice.dto.individualcustomer.IndCustCreateRequestDto;
import com.etiya.customerservice.dto.individualcustomer.IndCustCreateResponseDto;
import com.etiya.customerservice.entity.Customer;
import com.etiya.customerservice.entity.IndividualCustomer;
import com.etiya.customerservice.service.IndividualCustomerService;
import jakarta.ws.rs.GET;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/individualcustomers")
@RequiredArgsConstructor
public class IndividualCustomersController {
  private final IndividualCustomerService individualCustomerService;

  @GetMapping
  public List<IndividualCustomer> getAll(){
    return individualCustomerService.getAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<IndividualCustomer> getById(@PathVariable Long id){
    IndividualCustomer individualCustomer = individualCustomerService.getById(id);

    if (individualCustomer != null) {
      return ResponseEntity.ok(individualCustomer);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }

  @PostMapping
  public ResponseEntity<IndCustCreateResponseDto> add(@RequestBody IndCustCreateRequestDto customer){
    IndCustCreateResponseDto _customer = individualCustomerService.add(customer);

    if (_customer != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(_customer);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
  }
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    IndividualCustomer individualCustomer = individualCustomerService.getById(id);

    if (individualCustomer != null) {
      individualCustomerService.delete(id);
      return new ResponseEntity<>(HttpStatus.OK);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }
}
