package com.orjuelasso.back.lms.domain.order.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.orjuelasso.back.lms.domain.order.model.Order;
import com.orjuelasso.back.lms.domain.order.model.OrderItem;

public interface OrderRepository extends  
CrudRepository<Order, Long> {

    @Query("SELECT cp FROM Order cp join cp.user u WHERE u.id = :userId")
    public Optional<Order> findByOrderByUserId(@Param("userId") Long userId);
} 
