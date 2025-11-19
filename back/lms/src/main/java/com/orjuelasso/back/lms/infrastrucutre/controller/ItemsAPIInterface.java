package com.orjuelasso.back.lms.infrastrucutre.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.orjuelasso.back.lms.domain.item.Item;



public interface ItemsAPIInterface {
    @GetMapping("/items/{id}")
    public Item getItemById(Long id);
}
