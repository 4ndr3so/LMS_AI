package com.orjuelasso.back.lms.infrastrucutre.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.orjuelasso.back.lms.domain.user.model.User;



public interface UserAPIInterface {
    
    @GetMapping("/users/{id}")
    public User getUserById(Long id);
}
