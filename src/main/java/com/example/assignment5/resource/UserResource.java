package com.example.assignment5.resource;
import com.example.assignment5.exception.InfoException;
import com.example.assignment5.model.User;
import com.example.assignment5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource
{
    @Autowired
    private UserService userService;

    @GetMapping("/userName")
    public User getUserName(@RequestParam(name = "userName") String userName)throws InfoException{
        if(userName.equalsIgnoreCase("root")){
            throw new InfoException();
        }
        return userService.getByName(userName);
    }
}