package com.example.signin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Additional custom queries can be added here
    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);

}

