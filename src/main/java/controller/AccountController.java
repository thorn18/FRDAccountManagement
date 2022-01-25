package controller;

import entities.User;
import org.springframework.web.bind.annotation.*;
import services.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/users/{username}")
    public User getUser(@PathVariable String username){
        return this.accountService.findByUsername(username);
    }
}