package com.forever7.joblisting.model;

import org.springframework.data.annotation.Id;

import java.util.Arrays;

public class User {
    @Id
    private Number userId;
    private String name;

    private String email;
    private String phone;

    public Number getUserId(){
        return userId;
    }

    public void setUserId(){
        this.userId = userId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId" + userId + '\''+
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
