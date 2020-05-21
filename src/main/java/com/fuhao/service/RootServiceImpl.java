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

    public int insertstu(Nstudent nstudent) {
        return rootMapper.insertstu(nstudent);
    }

    public Seat getSeat(String seatnum) {
        return rootMapper.getSeat(seatnum);
    }

    public int updataseat(Pseat pseat) {
        return rootMapper.updataseat(pseat);
    }

    public int insertseat(Pseat pseat) {
        return rootMapper.insertseat(pseat);
    }

    public Message getMessage(String messagetext) {
        return rootMapper.getMessage(messagetext);
    }

    public int updatamsg(Message message) {
        return rootMapper.updatamsg(message);
    }

    public int insertmsg(Message message) {
        return rootMapper.insertmsg(message);
    }

    public News getNews(String newss) {
        return rootMapper.getNews(newss);
    }

    public int updatanews(News news) {
        return rootMapper.updatanews(news);
    }

    public int insertnews(News news) {
        return rootMapper.insertnews(news);
    }
}
