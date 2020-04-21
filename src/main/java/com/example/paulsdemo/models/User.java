package com.example.paulsdemo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import lombok.Data;
import javax.persistence.Entity;


//@Data
@Entity
public class User {

    private @Id @GeneratedValue Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String name;
    private String role;

    User() {}

    User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}