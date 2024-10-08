package com.shopdev.ecommerce_web.repository;

import com.shopdev.ecommerce_web.entity.ProductEntity;

import java.util.List;

public interface ProductRepository {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
