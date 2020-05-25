package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jasper Wu
 * @date 2020/5/21
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/index")
    public String index() {
        return "首页哈哈哈哈~";
    }

    @GetMapping("/index")
    public String getIndex() {
        return "首页哈哈哈哈~";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "hello1";
    }
    @RequestMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @RequestMapping("/f1")
    public String f1() {
        return "f1";
    }
    @RequestMapping("/f2")
    public String f2() {
        return "f2";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return "admin";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "user";
    }
}
