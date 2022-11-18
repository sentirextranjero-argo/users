package com.se.argo.users.service;

import com.se.argo.users.model.controller.GetUserResponse;
import com.se.argo.users.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    GetUserResponse findById(Long id);
    User save(User user);
    void deleteById(Long id);

}
