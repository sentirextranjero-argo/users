package com.se.argo.users.controller;

import com.se.argo.users.model.entity.User;
import com.se.argo.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users")
@RequiredArgsConstructor
public class UserController {

    /**
     *
     */
    private final UserService userService;

    @GetMapping("/")
    public List<User> getUserList() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        return null; //userService.findById(id);
    }
}
