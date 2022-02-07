package com.RFDSpring.controllers;

import com.RFDSpring.entities.Account;
import com.RFDSpring.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestControllerc
@RequestMapping("/api")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/accounts/{owner}")
    public List<Account> getAccounts(@PathVariable String owner){
        return this.accountService.findByowner(owner);
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account newAccount) {
        return this.accountService.addAccount(newAccount);
    }

    @PutMapping("/accounts")
    public Account updateAccount(@RequestBody Account newAccount) {
        return this.accountService.updateAccount(newAccount);
    }
}