package com.fuhao.controller;

import com.fuhao.pojo.Seat;
import com.fuhao.pojo.Student;
import com.fuhao.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RootController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @Autowired
    @Qualifier("MessageServiceImpl")
    private MessageService messageService;

    @Autowired
    @Qualifier("AppointServiceImpl")
    private AppointService appointService;
    @Autowired
    @Qualifier("QuitServiceImpl")
    private QuitService quitService;
    @Autowired
    @Qualifier("RootServiceImpl")
    private RootService rootService;

   @RequestMapping("/root/showstudent")
    public List<Student> rootstudent(){
       return rootService.getStudentList();
    }
    @RequestMapping("/root/showseat")
    public List<Seat> rootseat(){
        return rootService.getSeatList();
    }
}
