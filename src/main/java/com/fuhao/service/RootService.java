package com.fuhao.service;

import com.fuhao.pojo.*;

import java.util.List;

public interface RootService {
    List<Student> getStudentList();
    List<Seat> getSeatList();
    List<Message> getMessageList();
    List<News> getNewsList();
    Student getStudent(String num);
    int updatastu(Pstudent pstudent);
}
