package com.example.paulsdemo.controllers;

import com.example.paulsdemo.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;
import com.example.paulsdemo.models.User;


import java.util.List;

@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<User> all() {
        return repository.findAll();
    }

    @PostMapping("/users")
    User newEmployee(@RequestBody User user) {
        return repository.save(user);
    }

}
