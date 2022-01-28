package com.RFDSpring.repositories;

import com.RFDSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    public User getById(Integer userID);

    public User save(User entity);
}
