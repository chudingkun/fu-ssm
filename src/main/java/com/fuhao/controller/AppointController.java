package com.fuhao.controller;

import com.fuhao.pojo.Seat;
import com.fuhao.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointController {
    @Autowired
    @Qualifier("AppointServiceImpl")
    private AppointService appointService;

    @RequestMapping("/show/seat?floor=2")
    public List<Seat>  appoint2(int floor){
        List<Seat> seatList = appointService.getSeat(floor);
        return seatList;
    }
    @RequestMapping("/show/seat?floor=3")
    public List<Seat>  appoint3(int floor){
        List<Seat> seatList = appointService.getSeat(floor);
        return seatList;
    }
    @RequestMapping("/show/seat?floor=4")
    public List<Seat>  appoint4(int floor){
        List<Seat> seatList = appointService.getSeat(floor);
        return seatList;
    }
    @RequestMapping("/show/seat?floor=5")
    public List<Seat>  appoint5(int floor){
        List<Seat> seatList = appointService.getSeat(floor);
        return seatList;
    }
    @RequestMapping("/show/seat?floor=6")
    public List<Seat>  appoint6(int floor){
        List<Seat> seatList = appointService.getSeat(floor);
        return seatList;
    }
    @RequestMapping("/show/seat?floor=7")
    public List<Seat>  appoint7(int floor){
        List<Seat> seatList = appointService.getSeat(floor);
        return seatList;
    }
    @RequestMapping("/show/seat?floor=8")
    public List<Seat>  appoint8(int floor){
        List<Seat> seatList = appointService.getSeat(floor);
        return seatList;
    }
}
