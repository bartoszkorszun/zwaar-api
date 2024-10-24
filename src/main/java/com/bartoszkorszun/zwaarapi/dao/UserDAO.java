package com.bartoszkorszun.zwaarapi.dao;

import com.bartoszkorszun.zwaarapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    User saveUser(User user);

    Optional<User> getUserByEmail(String email);
}
