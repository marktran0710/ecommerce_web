package com.shopdev.ecommerce_web.repository;

import com.shopdev.ecommerce_web.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    UserEntity findByUserNam(String userName);
}
