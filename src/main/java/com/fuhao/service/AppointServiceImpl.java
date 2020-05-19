package com.fuhao.service;

import com.fuhao.dao.AppointMapper;
import com.fuhao.pojo.Seat;

import java.util.List;

public class AppointServiceImpl implements AppointService {
    private AppointMapper appointMapper;

    public void setAppointMapper(AppointMapper appointMapper) {
        this.appointMapper = appointMapper;
    }

    public List<Seat> getSeat(int floor) {
        return appointMapper.getSeat(floor);
    }
}
