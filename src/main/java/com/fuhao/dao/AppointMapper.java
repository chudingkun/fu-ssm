package com.fuhao.dao;

import com.fuhao.pojo.Seat;

import java.util.List;

public interface AppointMapper {

    List<Seat> getSeat(int floor);

    //int setappoint();

}
