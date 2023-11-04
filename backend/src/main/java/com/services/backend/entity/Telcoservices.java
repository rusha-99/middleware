package com.services.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Telcoservices {
    @Id
    private int serviceId;
    private String serviceName;

    private int monthlyCharge;
}
