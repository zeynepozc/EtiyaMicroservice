package com.etiya.customerservice.service.dto.request.contactMediumAddress;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateContactMediumAddressRequest {
    @NotNull
    private Long contactMedium;

    @NotNull
    private String contactAddress;
}
