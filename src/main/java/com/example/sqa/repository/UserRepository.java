package com.example.sqa.repository;

import java.util.List;

import com.example.sqa.entity.User;


public interface UserRepository {
    User findByUsername(String username);

    List<User> findAllByRole(String role);

}
