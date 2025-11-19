package com.orjuelasso.back.lms.domain.user.service;

import java.util.List;

import com.orjuelasso.back.lms.domain.user.model.User;

public interface IUserService {

    public List<User> findAllUsers();
    public User getUserById(Long id);
    public User saveUser(User user);
}
