package com.service1.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class RController {
    @GetMapping("/welcome")
    String welcome(){
        return "Welcome";
    }
}
