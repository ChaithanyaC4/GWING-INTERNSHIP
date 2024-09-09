package com.gwing.internship.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gwing.internship.repository.UserRepository;
import com.gwing.internship.user.User;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User saveEntity(User entity) {
        return userRepository.save(entity);
    }
}