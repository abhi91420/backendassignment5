package com.example.assignment5.repository;

import com.example.assignment5.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();

    public static User getUser(){
        User user = new User("1","name","abc@abc","abc/abc");
        return user;
    }

    public User saveUser(User user){
        user.setId(String.valueOf(userList.size()+1));
        userList.add(user);
        return user;
    }

    public User getUserByName(String name){
        for(User user :userList){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public User getUserByID(String id){

        for(User user: userList){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public User updateUser(String id, User user){

        for (User a : userList){
            if(a.getId().equals(id)){
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
