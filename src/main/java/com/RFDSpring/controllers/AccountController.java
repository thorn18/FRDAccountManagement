package com.RFDSpring.controllers;

import com.RFDSpring.entities.Account;
import com.RFDSpring.services.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/accounts/{accountID}")
    public Account getAccount(@PathVariable String accountID){
        return this.accountService.findById(accountID);
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