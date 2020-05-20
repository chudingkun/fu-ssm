package com.fuhao.controller;

import com.fuhao.pojo.Seat;
import com.fuhao.pojo.Student;
import com.fuhao.service.AppointService;
import com.fuhao.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AppointController {
    @Autowired
    @Qualifier("AppointServiceImpl")
    private AppointService appointService;
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    //展示座位
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

    //个人预约信息
    @RequestMapping("/appiont/myap")
    public Student myap01(Model model, HttpServletRequest request, HttpServletResponse response){
        String num= (String) request.getSession().getAttribute("num");
        Student student = userService.myap(num);
        String seatnum= student.getSeatnum();
        String floor=seatnum.substring(0,1);
        student.setClassname(floor);
        System.out.println(student);//这里classname 属性暂存 floor
        return student;
    }

    //查询修改个人信息
    @RequestMapping("/show/pmsg")
    public Student pmsg(HttpServletRequest request,HttpServletResponse response){
        String num = (String) request.getSession().getAttribute("num");
        Student student=userService.pmeg(num);
        System.out.println(student);
        return student;
    }

}