package com.fuhao.dao;

import com.fuhao.pojo.Root;
import com.fuhao.pojo.Seat;
import com.fuhao.pojo.Student;

import java.util.List;

public interface UserMapper {

    Student login(Student student);

    Student myap(String num);

    Seat  myseat(String num);

    Student pmeg(String num);

    int updatamsg(Student student);

    int checkroot(Root root);


}
