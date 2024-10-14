package com.etiya.customerservice.service.dto.request.neighborhood;

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
public class CreateNeighboorHoodRequest {
    @NotEmpty
    private String neighborHood;

    @NotNull
    private Long district;
}
