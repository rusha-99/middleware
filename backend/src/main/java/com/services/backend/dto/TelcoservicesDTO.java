package com.services.backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TelcoservicesDTO {


    private int serviceId;
    private String serviceName;

    private int monthlyCharge;
}
