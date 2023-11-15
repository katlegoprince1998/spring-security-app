package com.codeworld.springsecurity.service;

import com.codeworld.springsecurity.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUserName(String username);
}
