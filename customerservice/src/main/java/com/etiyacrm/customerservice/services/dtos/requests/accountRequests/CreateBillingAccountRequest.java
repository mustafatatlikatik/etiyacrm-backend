package com.etiyacrm.customerservice.services.dtos.requests.accountRequests;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateBillingAccountRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String customerId;
}
