package com.example.assignment5.service;

import com.example.assignment5.model.User;
import com.example.assignment5.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getByID(String userID) {
        return userRepository.getUserByID(userID);
    }

    public User updateUser(String id,User user) {
        return userRepository.updateUser(id,user);
    }

    public void deleteUser(String userID) {
        userRepository.getUserByID(userID);
    }

    public User getByName(String userName){
       return userRepository.getUserByName(userName);
    }
}
