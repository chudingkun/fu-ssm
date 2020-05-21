package com.fuhao.controller;

import com.fuhao.pojo.*;
import com.fuhao.service.QuitService;
import com.fuhao.service.RootService;
import com.fuhao.service.RootSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RootSetController {
    @Autowired
    @Qualifier("RootSetServiceImpl")
    private RootSetService rootSetService;
    @Autowired
    @Qualifier("RootServiceImpl")
    private RootService rootService;
    @Autowired
    @Qualifier("QuitServiceImpl")
    private QuitService quitService;

    //后台学生
    @RequestMapping("/root/studelete")
    public String rootstudel(String num){
    rootSetService.deletestu(num);
    return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/stuchange")
    public String studmsg(String num, Model model){
        System.out.println("--------------------"+num+"=======================");
        Student student = rootService.getStudent(num);
        model.addAttribute("student",student);
        model.addAttribute("num",num);
        return "rootstuchange";
    }
    @RequestMapping("/root/tostuchange")
    public String studmsg2(Pstudent pstudent){
         System.out.println("========================="+pstudent);
        rootService.updatastu(pstudent);
        return "redirect:/jsp/root.jsp";
    }
    //清空
    @RequestMapping("/root/stuclear")
    public String stuclear(String num){
        quitService.clearseat(num);
        quitService.clearstu(num);
        return "redirect:/jsp/root.jsp";
    }
    //学生增加
    @RequestMapping("/root/addstuchange")
    public String stuadd(Nstudent nstudent){
        rootService.insertstu(nstudent);
        return "redirect:/jsp/root.jsp";
    }


////////////////////////////////////////////////////////
    //后台座位
    @RequestMapping("/root/seatdelete")
    public String rootseatdel(String seatnum){
        rootSetService.deleteseat(seatnum);
        return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/seatchange")
    public String seatmsg(String seatnum, Model model){
        System.out.println("--------------------"+seatnum+"=======================");
        Seat seat = rootService.getSeat(seatnum);
        model.addAttribute("seat",seat);
        model.addAttribute("seatnum",seatnum);
        return "rootseatchange";
    }
    @RequestMapping("/root/toseatchange")
    public String seatdmsg2(Pseat pseat){
        System.out.println("========================="+pseat);
        rootService.updataseat(pseat);
        return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/addseatchange")
    public String seatadd(Pseat pseat){
        rootService.insertseat(pseat);
        return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/seatclear")
    public String seatclear(String seatnum){
        Seat seat = rootService.getSeat(seatnum);
        String num = Integer.toString(seat.getNum());
        quitService.clearseat(num);
        quitService.clearstu(num);
        return "redirect:/jsp/root.jsp";
    }

///////////////////////////////////////////////
    //公告-删除
    @RequestMapping("/root/messagedelete")
    public String rootmsgdel(String messagetext){
        rootSetService.deletmsg(messagetext);
        return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/msgchange")
    public String showmsg(String messagetext, Model model){
        System.out.println("--------------------"+messagetext+"=======================");
        Message message = rootService.getMessage(messagetext);
        model.addAttribute("message",message);
        model.addAttribute("messagetext",messagetext);
        return "rootmsgchange";
    }
    @RequestMapping("/root/tomsgchange")
    public String updatamsg(Message message){
        System.out.println("========================="+message);
        rootService.updatamsg(message);
        return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/addmsgtchange")
    public String addmsg(Message message){
        rootService.insertmsg(message);
        return "redirect:/jsp/root.jsp";
    }





  ////////////////////////////////////////////////////////////////////

    //咨询-删除
    @RequestMapping("/root/newsdelete")
    public String rootnewsdel(String newss){
        rootSetService.deletenews(newss);
        return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/newschange")
    public String shownews(String newss, Model model){
        System.out.println("--------------------"+newss+"=======================");
        News news = rootService.getNews(newss);
        model.addAttribute("news",news);
        model.addAttribute("newss",newss);
        return "rootnewschange";
    }
    @RequestMapping("/root/tonewschange")
    public String updatanews2(News news){
        System.out.println("========================="+news);
        rootService.updatanews(news);
        return "redirect:/jsp/root.jsp";
    }
    @RequestMapping("/root/addnewschange")
    public String addnews(News news){
        rootService.insertnews(news);
        return "redirect:/jsp/root.jsp";
    }
}
