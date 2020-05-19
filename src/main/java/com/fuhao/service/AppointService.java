package com.fuhao.service;

import com.fuhao.pojo.Seat;

import java.util.List;
import java.util.Map;

public interface AppointService {
    List<Seat> getSeat(int floor);

    int seatappoint(Map map);

    int seatsave(Map map);
}
