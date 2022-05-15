package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;


public interface UserDao {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
