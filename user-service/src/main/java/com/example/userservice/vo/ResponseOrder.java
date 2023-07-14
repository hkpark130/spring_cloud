package com.example.userservice.vo;

import lombok.Data;

@Data
public class ResponseOrder {
    private String productId;
    private String productName;
    private Integer quantity;
    private Integer price;

    private String orderId;
}
