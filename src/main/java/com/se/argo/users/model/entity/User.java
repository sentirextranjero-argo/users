package com.se.argo.users.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Builder
@Table(name = "user")
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue
    private UUID userId;

    private String name;

    private String firstSurname;

    private String secondSurname;

    @Column(unique = true)
    private String email;

    private String password;
}
