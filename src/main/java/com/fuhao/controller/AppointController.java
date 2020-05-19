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

    @RequestMapping("/show/seat")
    public List<Seat>  appoint2(){
        List<Seat> seatList = appointService.getSeat(2);
        System.out.println(seatList);
        return seatList;
    }
    @RequestMapping("/show/seat3")
    public List<Seat>  appoint3(){
        List<Seat> seatList = appointService.getSeat(3);
        System.out.println(seatList);
        return seatList;
    }
    @RequestMapping("/show/seat4")
    public List<Seat>  appoint4(){
        List<Seat> seatList = appointService.getSeat(4);
        System.out.println(seatList);
        return seatList;
    }
    @RequestMapping("/show/seat5")
    public List<Seat>  appoint5(){
        List<Seat> seatList = appointService.getSeat(5);
        System.out.println(seatList);
        return seatList;
    }
    @RequestMapping("/show/seat6")
    public List<Seat>  appoint6(){
        List<Seat> seatList = appointService.getSeat(6);
        System.out.println(seatList);
        return seatList;
    }
    @RequestMapping("/show/seat7")
    public List<Seat>  appoint7(){
        List<Seat> seatList = appointService.getSeat(7);
        System.out.println(seatList);
        return seatList;
    }
    @RequestMapping("/show/seat8")
    public List<Seat>  appoint8(){
        List<Seat> seatList = appointService.getSeat(8);
        if(seatList==null){

        }
        System.out.println(seatList);
        return seatList;
    }
}
