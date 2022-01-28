package com.RFDSpring.services;

import com.RFDSpring.entities.Account;
import com.RFDSpring.entities.User;
import com.RFDSpring.repositories.AccountRepository;
import com.RFDSpring.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(String accountID) {
        return userRepository.findByUsername(accountID);
    }

    public User addUser(User newUser) {
        return userRepository.save(newUser);

    }

    public User updateUser(User newUser) {
        return userRepository.save(newUser);
    }
}
