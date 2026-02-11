package com.example.springbootstudy; // 这是你的包名

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 这个注解对应了你图片里的 Controller 角色
public class HelloController {

    @GetMapping("/hello") // 这个注解对应了你图片里的 HandlerMapping 逻辑
    public String sayHello() {
        return "Spring Boot 环境终于配置好了！";
    }
}