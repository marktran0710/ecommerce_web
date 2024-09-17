package com.shopdev.ecommerce_web.services;

import com.shopdev.ecommerce_web.entity.user.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    // get all by limit offset
    Page<UserEntity> findAllUsers(Pageable pageable);

    // search by limit offset
    Page<UserEntity> findByUserName(String userName,Pageable pageable);
}
