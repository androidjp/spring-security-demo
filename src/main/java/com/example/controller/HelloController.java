package com.example.controller;

import org.springframework.web.bind.annotation.*;

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

    // @MatrixVariable 是 Spring 3.2 开始有个一个新的传参方式，使得参数之间啊可以用 ; 隔开
    // 但这种方式恰恰就是 Spring Security 禁止的，所以，要用，就要让 Spring Security 放行
    // call 法： http://localhost:8080/hello2/123;name=jaap
    @RequestMapping(value = "/hello2/{id}")
    public void hello2(@PathVariable Integer id, @MatrixVariable String name) {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
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
