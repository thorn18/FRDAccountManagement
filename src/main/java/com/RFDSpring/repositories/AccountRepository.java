package com.RFDSpring.repositories;

import com.RFDSpring.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findByowner(String owner);

    Account findByaccountID(String accountID);

    public Account getById(Integer userID);

    public Account save(Account account);
}
