package com.fuhao.service;

import com.fuhao.pojo.Seat;
import com.fuhao.pojo.Student;

import java.util.List;

public interface UserService {

    Student login(Student student);
    Student myap(String num);
    Seat myseat(String num);
    Student pmeg(String num);
    Student updatmsg(Student student,String num);
}