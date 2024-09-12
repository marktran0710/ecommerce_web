package com.shopdev.ecommerce_web.entity;

import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Table(name = "java_product_001")
public class ProductEntity {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
}
