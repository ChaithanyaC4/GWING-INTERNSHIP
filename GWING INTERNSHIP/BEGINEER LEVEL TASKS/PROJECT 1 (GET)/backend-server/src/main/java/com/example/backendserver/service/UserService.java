package com.example.backendserver.service;

import com.example.backendserver.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}