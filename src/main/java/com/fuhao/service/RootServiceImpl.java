package com.fuhao.service;

import com.fuhao.dao.RootMapper;
import com.fuhao.pojo.Seat;
import com.fuhao.pojo.Student;

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
}
