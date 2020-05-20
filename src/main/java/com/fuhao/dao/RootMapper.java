package com.fuhao.dao;

import com.fuhao.pojo.Seat;
import com.fuhao.pojo.Student;

import java.util.List;

public interface RootMapper {
    List<Student> getStudentList();
    List<Seat> getSeatList();
}
