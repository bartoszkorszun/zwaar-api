package com.bartoszkorszun.zwaarapi.service;

import com.bartoszkorszun.zwaarapi.dao.UserDAO;
import com.bartoszkorszun.zwaarapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User saveUser(User user) {
        return userDAO.saveUser(user);
    }

    public Optional<User> getUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }
}
