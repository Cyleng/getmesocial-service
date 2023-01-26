package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList<User>();
    public User getOneUser(){
        User user = new User("CY", "Ca", 20);
        return user;
    }

    public User saveUser(User user) {
        user.setUserId(userList.size()+1);
        userList.add(user);
        return user;
    }
}
