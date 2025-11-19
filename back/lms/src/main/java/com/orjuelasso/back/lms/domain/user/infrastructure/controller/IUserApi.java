package com.orjuelasso.back.lms.domain.user.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orjuelasso.back.lms.domain.user.model.User;


@RequestMapping("/api/v1") // Base mapping for the API
public interface IUserApi {

    @GetMapping("/user")
    List<User> getUsers();


    @PostMapping("/user")
    User saveUser(@RequestBody User entity);
    
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id);
} 
