package com.bartoszkorszun.zwaarapi.dao;

import com.bartoszkorszun.zwaarapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    void saveUser(User user);
}