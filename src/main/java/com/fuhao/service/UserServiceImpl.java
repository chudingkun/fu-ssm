package com.fuhao.service;

import com.fuhao.dao.UserMapper;
import com.fuhao.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    //业务层调用dao层：组合dao层

    //事务直接用spring 横切
    private UserMapper  userMapper;

    public void setUserMapper(UserMapper userMapper) { //set方法可以被spring托管
        this.userMapper = userMapper;
    }

    public List<User> getUserList() {
       return userMapper.getUserList();
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public int updataUser(User user) {
        return userMapper.updataUser(user);
    }

    public User login(User user) {
        return userMapper.login(user);
    }
}
