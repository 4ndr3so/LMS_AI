package com.orjuelasso.back.lms.domain.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.orjuelasso.back.lms.domain.user.model.User;

public interface UserRepository extends CrudRepository <User, Long> {

    
} 
