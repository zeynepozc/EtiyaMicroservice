package com.etiya.customerservice.dto.customeraccount;

import com.etiya.customerservice.entity.Customer;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerAccountRequestDto {

    private Long customerId;

    @NotEmpty
    private String accountStatus;

    @NotEmpty
    private String accountNumber;

    @NotEmpty
    private String accountName;

    @NotEmpty
    private String accountType;

    @NotEmpty
    private String action;

    @NotEmpty
    private String accountDescription;
}
