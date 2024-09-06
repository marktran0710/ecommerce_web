package com.shopdev.ecommerce_web.services;

import com.shopdev.ecommerce_web.entity.user.UserEntity;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);
    List<UserEntity> getAllUsers();
}
