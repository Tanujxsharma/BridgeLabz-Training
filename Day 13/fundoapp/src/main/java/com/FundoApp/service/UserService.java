package com.FundoApp.service;

import com.FundoApp.entity.User;

import java.util.Optional;

public interface UserService {

    User register(User user);

    Optional<User> findByEmail(String email);

    boolean checkPassword(String rawPassword, String encodedPassword);
}