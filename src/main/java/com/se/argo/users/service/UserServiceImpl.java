package com.se.argo.users.service;

import com.se.argo.users.model.controller.GetUserResponse;
import com.se.argo.users.model.entity.User;
import com.se.argo.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public GetUserResponse findById(Long id) {
        User result = User.builder().build();
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            result = user.get();
        }
        return null;
    }

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
