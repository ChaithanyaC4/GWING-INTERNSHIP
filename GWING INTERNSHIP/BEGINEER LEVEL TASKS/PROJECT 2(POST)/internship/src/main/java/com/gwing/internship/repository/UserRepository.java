package com.gwing.internship.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gwing.internship.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}