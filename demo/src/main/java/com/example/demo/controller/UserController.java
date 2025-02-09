package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/greet")
    public String greetUser(@RequestBody User user) {
        return "Hello, " + user.getName() + "!";
    }
}
