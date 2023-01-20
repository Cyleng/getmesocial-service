package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getOneUser(){
        User user = new User("CY", "Ca", 20);
        return user;
    }
}
