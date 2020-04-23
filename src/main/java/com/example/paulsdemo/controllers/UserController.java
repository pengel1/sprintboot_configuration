package com.example.paulsdemo.controllers;

import com.example.paulsdemo.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.paulsdemo.models.User;


import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> getAllUsers() {
        return  repository.findAll();
    }

    @PostMapping("/users")
    @ResponseStatus(value = HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {
        return repository.save(user);
    }


}
