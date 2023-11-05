package com.services.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "\"telcoservices\"")
public class Telcoservices {
    @Id
    @Column(name="serviceId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;

    @Column(name="serviceName")
    private String serviceName;

    @Column(name="monthlyCharge")
    private int monthlyCharge;
}
