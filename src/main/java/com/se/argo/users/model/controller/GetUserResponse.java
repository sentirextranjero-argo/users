package com.se.argo.users.model.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GetUserResponse {

    private String userId;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String email;

}
