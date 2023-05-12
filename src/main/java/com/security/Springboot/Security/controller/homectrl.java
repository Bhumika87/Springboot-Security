package com.security.Springboot.Security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class homectrl {
    @GetMapping("/home")
    public String homefun(){
        return "hello welcome to home page";
    }
    @GetMapping("/dashboard")
    public String dashb(){
        return "hello , welcome to dashboard";
    }

}
