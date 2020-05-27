package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jasper Wu
 * @date 5/27/2020
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
