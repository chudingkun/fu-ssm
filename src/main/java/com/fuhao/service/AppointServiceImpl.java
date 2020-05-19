package com.fuhao.service;

import com.fuhao.dao.AppointMapper;
import com.fuhao.pojo.Seat;

import java.util.List;
import java.util.Map;

public class AppointServiceImpl implements AppointService {

    private AppointMapper appointMapper;

    public void setAppointMapper(AppointMapper appointMapper) {
        this.appointMapper = appointMapper;
    }

    public List<Seat> getSeat(int floor) {
        return appointMapper.getSeat(floor);
    }

    public int seatappoint(Map map) {
        return appointMapper.seatappoint(map);
    }

    public int seatsave(Map map) {
        return appointMapper.seatsave(map);
    }
}
