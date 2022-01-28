package com.RFDSpring.services;

import com.RFDSpring.entities.Account;
import com.RFDSpring.repositories.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account findById(String accountID) {
        return accountRepository.findByaccountID(accountID);
    }

    public Account addAccount(Account account) {
        return accountRepository.save(account);

    }

    public Account updateAccount(Account newAccount) {
        return accountRepository.save(newAccount);
    }
}
