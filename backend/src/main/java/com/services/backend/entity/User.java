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
    @Lob
    @Column(name="userId")
    private byte[] userId;

    @Column(name="userName")
    private String userName;

    @Column(name="name")
    private String name;


    @Column(name="phoneNumber")
    private String phoneNumber;
}
