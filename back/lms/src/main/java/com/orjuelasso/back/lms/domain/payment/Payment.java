package com.orjuelasso.back.lms.domain.payment;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.orjuelasso.back.lms.domain.order.model.Order;

@Entity
@Table(name = "payments")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount", precision = 10, scale = 2, nullable = false)
    private BigDecimal amount;

    @Column(name = "method", nullable = false, length = 50)
    private String method;

    @Column(name = "transaction_status", nullable = false, length = 50)
    private String transactionStatus;

    @Column(name = "transaction_id", unique = true, length = 100)
    private String transactionId;

    @Column(name = "processed_at")
    private OffsetDateTime processedAt;

    // --- Relationship ---
    
    // Many-to-One: Many payments can belong to one order
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false) // FK back to the orders table
    private Order order;
}
