package com.orjuelasso.back.lms.model;

import java.sql.Date;
import java.util.Map;

import lombok.Data;


@Data
public class CartStore {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long order;
    private Long userId;
    private String payment;
    private Map<Long, Integer> products; // Map of product IDs to quantities
    private String status;
    private Double totalPrice;
    private Date createdAt;



}
