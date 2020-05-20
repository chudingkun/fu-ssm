package com.fuhao.controller;

import com.fuhao.pojo.*;
import com.fuhao.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ControllerTest01 {
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
    //登陆
    @PostMapping("/ssm/login")
    public String testlogin(Student student, Model model, HttpServletRequest request, HttpServletResponse response){

            HttpSession session =request.getSession();

            Root root =new Root();
         root.setName(student.getNum());
         root.setPassword(student.getPassword());

         System.out.println("------开始"+root);
         if(userService.checkroot(root)!=null){
             session.setAttribute("name",root.getName());
             System.out.println("------root："+session.getAttribute("name"));
             return "root";


         } else if(userService.login(student)!=null){
             System.out.println("------index："+student);
            List<Message> messageList=messageService.getMessageList();
            List<News> newsList=messageService.getNewsList();
            List<Teacher> teachers = messageService.getTeacherList();
            model.addAttribute("messagelist",messageList);
            model.addAttribute("newslist",newsList);
            model.addAttribute("teachers",teachers);//jstL 登陆显示数据
             session.setAttribute("messagelist",messageList);
             session.setAttribute("newslist",newsList);
             session.setAttribute("teachers",teachers);
            session.setAttribute("num",userService.login(student).getNum());
            session.setAttribute("realname",userService.login(student).getRealname());
                return "redirect:/ssm/rlogin";
        }else {
             model.addAttribute("errormsg","用户名或密码错误!");
                return "redirect:/Login.jsp";
        }
    }

    @RequestMapping("/ssm/rlogin")
    public String rlogin(HttpServletRequest request,HttpServletResponse response,Model model){
        model.addAttribute("messagelist",request.getSession().getAttribute("messagelist"));
        model.addAttribute("newslist",request.getSession().getAttribute("newslist"));
        model.addAttribute("teachers",request.getSession().getAttribute("teachers"));
        return "index";
    }

    //预约请求
    @RequestMapping("/myappoint/ap")
    public String appointseat(String seatnum, HttpServletRequest request, HttpServletResponse response){
        String num= (String) request.getSession().getAttribute("num");
        System.out.println("--------------"+num);
        Map map =new HashMap();
        map.put("num",num);
        map.put("seat",seatnum);
        System.out.println(map.get("seat"));
        appointService.seatappoint(map);
        appointService.seatsave(map);
        return "redirect:/jsp/appoint.jsp";

    }

    //重新预约
    @RequestMapping("/reappoint")
    public String reappoint(HttpServletRequest request,HttpServletResponse response){

        String num= (String) request.getSession().getAttribute("num");
        System.out.println("----------------"+num);
        quitService.clearseat(num);
        quitService.clearstu(num);
        return "redirect:/jsp/appoint.jsp";
    }
    //离开
    @RequestMapping("/quitSystem")
    public String qiut(HttpServletRequest request,HttpServletResponse response){

        String num= (String) request.getSession().getAttribute("num");
        System.out.println("----------------"+num);
        quitService.clearseat(num);
        quitService.clearstu(num);
        request.getSession().invalidate();
        return "redirect:/Login.jsp";
    }
    //修改个人信息   未完成，
    @RequestMapping("/changemsg")
    public String changemsg(Student student,HttpServletRequest request,HttpServletResponse response){
        String num = (String) request.getSession().getAttribute("num");
        student.setNum(num);
        userService.updatamsg(student);
        return "redirect:/jsp/pmessage.jsp";
    }

}
