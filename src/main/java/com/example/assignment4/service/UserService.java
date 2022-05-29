package com.example.assignment4.service;

import com.example.assignment4.model.User;
import com.example.assignment4.repository.UserRepository;
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

    public User getByID(long userID) {
        return userRepository.getUserByID(userID);
    }

    public User updateUser(long id,User user) {
        return userRepository.updateUser(id,user);
    }

    public void deleteUser(long userID) {
        userRepository.getUserByID(userID);
    }
}
