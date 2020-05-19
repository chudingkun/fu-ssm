package com.fuhao.service;

import com.fuhao.pojo.Seat;

import java.util.List;

public interface AppointService {
    List<Seat> getSeat(int floor);
}
