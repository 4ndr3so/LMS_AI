package com.orjuelasso.back.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.orjuelasso.back.lms.model.Item;

public interface ItemsAPIInterface {
    @GetMapping("/items/{id}")
    public Item getItemById(Long id);
}
