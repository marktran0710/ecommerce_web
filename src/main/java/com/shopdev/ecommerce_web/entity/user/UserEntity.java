package com.shopdev.ecommerce_web.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    @Id
    private Long id;
    private String username;
    private String userEmail;
}
