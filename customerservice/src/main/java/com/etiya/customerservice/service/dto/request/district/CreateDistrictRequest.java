package com.etiya.customerservice.service.dto.request.district;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateDistrictRequest {
    @NotEmpty
    private String district;

    @NotNull
    private Long city;
}
