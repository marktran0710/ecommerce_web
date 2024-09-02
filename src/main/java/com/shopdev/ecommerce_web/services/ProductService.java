package com.shopdev.ecommerce_web.services;

import com.shopdev.ecommerce_web.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
