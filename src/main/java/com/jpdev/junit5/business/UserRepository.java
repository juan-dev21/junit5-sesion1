package com.jpdev.junit5.business;

public class UserRepository{

    public User getUser(String userId) {
        return new User(userId);
    }



}
