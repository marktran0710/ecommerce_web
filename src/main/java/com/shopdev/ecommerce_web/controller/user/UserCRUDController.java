package com.shopdev.ecommerce_web.controller.user;

import com.shopdev.ecommerce_web.entity.user.UserEntity;
import com.shopdev.ecommerce_web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCRUDController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);
    };

    public  UserEntity searchUser(@RequestParam String userName, @RequestParam String userEmail) {
        return userService.findByUserNameAndUserEmail(userName,userEmail);
    }
}
