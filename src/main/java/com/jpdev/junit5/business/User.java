package com.jpdev.junit5.business;

public class User {

    private String userId;
    private String password;

    public User(String userId) {
        this.userId = userId;
        this.password = "abc123.";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
