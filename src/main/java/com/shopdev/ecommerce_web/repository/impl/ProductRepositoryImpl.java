package com.shopdev.ecommerce_web.repository.impl;

import com.shopdev.ecommerce_web.entity.ProductEntity;
import com.shopdev.ecommerce_web.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        product.setId(1L);
        product.setProductName("Tips Java");
        product.setProductPrice(new BigDecimal("21.5"));
        return product;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        ProductEntity product = new ProductEntity();
        product.setId(1L);
        product.setProductName("Tips Java");
        product.setProductPrice(new BigDecimal("21.5"));
        return List.of(product);
    }
}
