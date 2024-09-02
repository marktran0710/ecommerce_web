package com.shopdev.ecommerce_web.services.impl;

import com.shopdev.ecommerce_web.entity.ProductEntity;
import com.shopdev.ecommerce_web.repository.ProductRepository;
import com.shopdev.ecommerce_web.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.createProduct(product);
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        return productRepository.findAllProducts();
    }
}
