package com.example.catalogservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CatalogDto implements Serializable {
    private String productId;
    private Integer quantity;
    private Integer price;

    private String orderId;
    private String userId;
}
