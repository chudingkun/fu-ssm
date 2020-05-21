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
    int insertstu(Nstudent nstudent);

    Seat getSeat(String seatnum);
    int updataseat(Pseat pseat);
    int insertseat(Pseat pseat);

    Message getMessage(String messagetext);
    int updatamsg(Message message);
    int insertmsg(Message message);

    News getNews(String newss);
    int updatanews(News news);
    int insertnews(News news);
}
