package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jasper Wu
 * @date 2020/6/8
 **/
public interface UserRepository  extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
