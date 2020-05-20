package com.fuhao.service;

import com.fuhao.pojo.Seat;
import com.fuhao.pojo.Student;

import java.util.List;

public interface RootService {
    List<Student> getStudentList();
    List<Seat> getSeatList();
}
