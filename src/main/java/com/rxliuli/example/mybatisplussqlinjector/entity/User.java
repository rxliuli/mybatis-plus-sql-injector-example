package com.rxliuli.example.mybatisplussqlinjector.entity;

import java.io.Serializable;

/**
 * @author rxliuli
 */
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
