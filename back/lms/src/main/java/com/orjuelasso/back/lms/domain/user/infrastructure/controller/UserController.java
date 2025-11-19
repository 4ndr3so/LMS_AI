package com.orjuelasso.back.lms.domain.user.infrastructure.controller;

import org.springframework.web.bind.annotation.RestController;

import com.orjuelasso.back.lms.domain.user.model.User;
import com.orjuelasso.back.lms.domain.user.repository.UserRepository;
import com.orjuelasso.back.lms.domain.user.service.IUserService;
import com.orjuelasso.back.lms.domain.user.service.UserServiceImp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class UserController implements IUserApi {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public User getUserById(Long id) {
        // TODO Auto-generated method stub
        return userService.findUserById(id);
    }

    @Override
    public List<User> getUsers() {
        // TODO Auto-generated method stub
        return userService.findAllUsers();
    }

    @Override
    public User saveUser(User entity) {
        // TODO Auto-generated method stub
        return userService.saveUser(entity);
    }
    


  
}
