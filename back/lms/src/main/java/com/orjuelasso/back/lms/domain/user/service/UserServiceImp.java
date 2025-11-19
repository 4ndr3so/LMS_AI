package com.orjuelasso.back.lms.domain.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orjuelasso.back.lms.domain.user.model.User;
import com.orjuelasso.back.lms.domain.user.repository.UserRepository;

@Service
public class UserServiceImp implements IUserService {
    
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public User findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null); // Simple null return if not found
    }

    @Override
    public List<User> findAllUsers() {
        // TODO Auto-generated method stub
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
      return userRepository.save(user);
    }
    
}
