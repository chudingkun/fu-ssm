package com.fuhao.dao;

import com.fuhao.pojo.Seat;

import java.util.List;
import java.util.Map;

public interface AppointMapper {

    List<Seat> getSeat(int floor); //座位展示

    int seatappoint(Map map);   //座位预约

    int seatsave(Map map);  //座位号存到用户表

}
