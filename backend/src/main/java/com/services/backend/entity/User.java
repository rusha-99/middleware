package com.services.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "\"user\"")
public class User {
    @Id
    @Column(name="userId")
    private String userId;

    @Column(name="userName")
    private String userName;

    @Column(name="name")
    private String name;


    @Column(name="phoneNumber")
    private String phoneNumber;
}
