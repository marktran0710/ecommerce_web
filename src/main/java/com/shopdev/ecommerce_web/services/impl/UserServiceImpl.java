package com.shopdev.ecommerce_web.services.impl;

import com.shopdev.ecommerce_web.entity.user.UserEntity;
import com.shopdev.ecommerce_web.repository.UserRepository;
import com.shopdev.ecommerce_web.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity findByUserNameAndUserEmail(String userName, String userEmail) {
        return userRepository.findByUserNameAndUserEmail(userName, userEmail);
    }
}
