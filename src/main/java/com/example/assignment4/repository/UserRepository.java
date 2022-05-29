package com.example.assignment4.repository;

import com.example.assignment4.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();
    User noUser = new User(0,"n/a","n/a","n/a");
    public static User getUser(){
        User user = new User(1,"name","abc@abc","abc/abc");
        return user;
    }

    public User saveUser(User user){
        user.setId(userList.size()+1);
        userList.add(user);
        return user;
    }

    public User getUserByID(long id){

        for(User user: userList){
            if(user.getId() == id){
                return user;
            }
        }
        return noUser;
    }

    public User updateUser(long id, User user){

        for (User a : userList){
            if(a.getId() == id){
                a.setName(user.getName());
                a.setEmail(user.getEmail());
                a.setProfilePhotoUrl(user.getProfilePhotoUrl());
                return a;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
