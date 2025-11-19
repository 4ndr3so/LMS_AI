package com.orjuelasso.back.lms.domain.order.model;

import java.math.BigDecimal;

import com.orjuelasso.back.lms.domain.item.Item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId; // Maps to cart_item_id

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "price_paid", precision = 10, scale = 2, nullable = false)
    private BigDecimal pricePaid; // Crucial for historical accuracy

    // --- Relationships ---

    // Many-to-One: Many line items belong to one order
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false) // Maps to FK in DB
    private Order order;

    // Many-to-One: Many line items point to one product
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Item item;
}