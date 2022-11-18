package com.se.argo.users.controller.mapper;

import com.se.argo.users.model.controller.GetUserResponse;
import com.se.argo.users.model.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface GetUserResponseMapper {

    GetUserResponse userToGetUserResponse(User user);
}
