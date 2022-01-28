package com.RFDSpring.controllers;

import com.RFDSpring.entities.Account;
import com.RFDSpring.entities.User;
import com.RFDSpring.services.AccountService;
import com.RFDSpring.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/users/{username}")
    public User getAccount(@PathVariable String userID){
        return this.userService.findById(userID);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
        return this.userService.addUser(newUser);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User updatedUser) {
        return this.userService.updateUser(updatedUser);
    }
}