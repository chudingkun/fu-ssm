package com.fuhao.dao;

import com.fuhao.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int deleteUser(int id);

    int updataUser(User user);

    User login(User user);
}
