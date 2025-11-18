package com.orjuelasso.back.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.orjuelasso.back.lms.model.User;

public interface UserAPIInterface {
    
    @GetMapping("/users/{id}")
    public User getUserById(Long id);
}
