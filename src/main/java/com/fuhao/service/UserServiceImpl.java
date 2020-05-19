package com.fuhao.service;

import com.fuhao.dao.UserMapper;
import com.fuhao.pojo.Student;

import java.util.List;

public class UserServiceImpl implements UserService {
    //业务层调用dao层：组合dao层

    //事务直接用spring 横切
    private UserMapper  userMapper;

    public void setUserMapper(UserMapper userMapper) { //set方法可以被spring托管
        this.userMapper = userMapper;
    }

    public Student login(Student student) {
        return userMapper.login(student);
    }
}
