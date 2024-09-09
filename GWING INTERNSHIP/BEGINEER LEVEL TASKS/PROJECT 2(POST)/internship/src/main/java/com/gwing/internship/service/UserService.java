package com.gwing.internship.service;

import java.util.List;

import com.gwing.internship.user.User;

public interface UserService {
    List<User> getAllUsers();
    User saveEntity(User entity);
}