package com.etiya.customerservice.controller;

import com.etiya.customerservice.service.abstracts.DistrictService;
import com.etiya.customerservice.service.dto.request.district.CreateDistrictRequestDto;
import com.etiya.customerservice.service.dto.request.district.UpdateDistrictRequestDto;
import com.etiya.customerservice.service.dto.response.district.CreateDistrictResponseDto;
import com.etiya.customerservice.service.dto.response.district.GetByIdDistrictResponseDto;
import com.etiya.customerservice.service.dto.response.district.ListDistrictResponseDto;
import com.etiya.customerservice.service.dto.response.district.UpdateDistrictResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/districts")
@RequiredArgsConstructor
public class DistrictController {
    private final DistrictService districtService;

    @GetMapping
    public List<ListDistrictResponseDto> getAll(){
        return districtService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetByIdDistrictResponseDto> getById(@PathVariable Long id){
        GetByIdDistrictResponseDto districtResponseDto = districtService.getById(id);

        if (districtResponseDto != null) {
            return ResponseEntity.ok(districtResponseDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<CreateDistrictResponseDto> add(@RequestBody CreateDistrictRequestDto district){
        CreateDistrictResponseDto _district = districtService.add(district);

        if (_district != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(_district);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        GetByIdDistrictResponseDto country = districtService.getById(id);

        if (country != null) {
            districtService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping
    public ResponseEntity<UpdateDistrictResponseDto> getById(@RequestBody UpdateDistrictRequestDto district){
        GetByIdDistrictResponseDto districtDto = districtService.getById(district.getId());

        if (districtDto != null) {
            UpdateDistrictResponseDto districtResponseDto = districtService.update(district);
            return ResponseEntity.ok(districtResponseDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}