package com.security.Springboot.Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class adminCtrl {
    @GetMapping("/home")
    public String adminhome()
    {
        return "welcome to admin home";
    }
    @GetMapping("/dashboard")
    public String admindashboard()
    {
        return "welcome to admin dashboard";
    }
}
