package com.RFDSpring.repositories;

import com.RFDSpring.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByaccountID(String accountID);

    public Account getById(Integer userID);

    public Account save(Account account);
}
