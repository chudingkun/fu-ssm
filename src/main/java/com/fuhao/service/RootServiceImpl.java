package com.fuhao.service;

import com.fuhao.dao.RootMapper;
import com.fuhao.pojo.*;

import java.util.List;

public class RootServiceImpl implements RootService{
    private RootMapper rootMapper;

    public void setRootMapper(RootMapper rootMapper) {
        this.rootMapper = rootMapper;
    }

    public List<Student> getStudentList() {
        return rootMapper.getStudentList();
    }

    public List<Seat> getSeatList() {
        return rootMapper.getSeatList();
    }

    public List<Message> getMessageList() {
        return rootMapper.getMessageList();
    }

    public List<News> getNewsList() {
        return rootMapper.getNewsList();
    }

    public Student getStudent(String num) {
        return rootMapper.getStudent(num);
    }

    public int updatastu(Pstudent  pstudent) {
        return rootMapper.updatastu(pstudent);
    }
}
