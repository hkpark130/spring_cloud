package com.example.orderservice.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private Integer quantity;
    private Integer price;

    private String userId;
    private String orderId;
}
