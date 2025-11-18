package com.orjuelasso.back.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface CartAPIInterface {
    
    @GetMapping("/carts/{id}")
    public Long getCartById(Long id);
}
