package com.example.spring.service;

public class User {
    Long id;
    String mail;
    String password;
    String bob;
    public User(long id, String mail, String password, String bob) {
        this.id = id;
        this.bob = bob;
        this.mail = mail;
        this.password = password;
    }

    public Object getName() {
        return this.bob;
    }

    public String getEmail() {
        return this.mail;
    }

    public Object getPassword() {
        return this.password;
    }

    public long getId() {
        return this.id;
    }
}
