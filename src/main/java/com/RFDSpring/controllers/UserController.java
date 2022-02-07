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

    @CrossOrigin(origins = "*")
    @PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
        return this.userService.addUser(newUser);
    }



    @CrossOrigin(origins = "*")
    @PostMapping("/users/login")
    public User login(@RequestBody User newUser) {
        return this.userService.login(newUser.username, newUser.password);
    }


    @CrossOrigin(origins = "*")
    @PutMapping("/users")
    public User updateUser(@RequestBody User updatedUser) {
        return this.userService.updateUser(updatedUser);
    }
}