package com.example.paulsdemo.controllers;

import com.example.paulsdemo.models.Package;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import com.example.paulsdemo.repositories.PackageRepository;

@RestController
public class PackageController {


    private final PackageRepository repository;

    PackageController(PackageRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/api/v1/package")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Package savePackage() {
        Package p = new Package();
        return repository.save(p);
    }


    @GetMapping("/api/v1/package/{id}")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Optional<Package> getPackage(@PathVariable Long id) {

        Package p = new Package();
        long val = id.longValue();
        return repository.findById(val);
    }

}
