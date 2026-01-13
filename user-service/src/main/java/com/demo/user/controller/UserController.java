package com.demo.user.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("Paras", "Amit", "Rahul");
    }

    @PostMapping
    public String createUser(@RequestBody String name) {
        return "User created: " + name;
    }
}
