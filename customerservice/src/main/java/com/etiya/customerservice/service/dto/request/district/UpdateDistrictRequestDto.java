package com.etiya.customerservice.service.dto.request.district;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDistrictRequestDto {
    @NotEmpty
    private Long id;
    @NotEmpty
    private String name;

}
