package com.se.argo.users.controller.mapper;

import com.se.argo.users.model.controller.GetUserResponse;
import com.se.argo.users.model.entity.User;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class GetUserResponseMapperIntegrationTest {

    public static final String NAME = "SAIOA";
    public static final String FIRST_SURNAME = "CHANCA";
    public static final String SECOND_SURNAME = "GONZALEZ";
    public static final String EMAIL = "SAIOA@SENTIREXTRANJERO.COM";
    public static final String PASSWORD = "PWD";

    private GetUserResponseMapper mapper = Mappers.getMapper(GetUserResponseMapper.class);

    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        User source = User.builder().id(1L).userId(UUID.randomUUID()).name(NAME).firstSurname(FIRST_SURNAME)
                .secondSurname(SECOND_SURNAME).email(EMAIL).password(PASSWORD).build();

        GetUserResponse destination = mapper.userToGetUserResponse(source);

        assertEquals(source.getEmail(), destination.getEmail());
    }

}