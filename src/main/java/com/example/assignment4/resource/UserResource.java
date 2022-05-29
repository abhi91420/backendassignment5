package com.example.assignment4.resource;
import com.example.assignment4.model.User;
import com.example.assignment4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource
{
    @Autowired
    private UserService userService;
    @PostMapping
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @GetMapping("/userID")
    public User getById(@RequestParam(name = "userID") long userID)
    {
        return userService.getByID(userID);
    }
    @PutMapping
    public User updateUser(@RequestBody long id,User user)
    {
        return userService.updateUser(id,user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userID") long userID)
    {
        userService.deleteUser(userID);
    }

}