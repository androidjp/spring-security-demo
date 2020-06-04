package com.example.controller;

import com.example.service.UserIPService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jasper Wu
 * @date 2020/5/21
 **/
@RestController
public class HelloController {
    @Resource
    private UserIPService userIPService;

    @GetMapping("hello")
    public String hello() {
        return "hello" + userIPService.getUserIP();
    }
}
