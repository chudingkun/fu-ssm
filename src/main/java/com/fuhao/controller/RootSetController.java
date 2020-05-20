package com.fuhao.controller;

import com.fuhao.pojo.Pstudent;
import com.fuhao.pojo.Student;
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
    public String studmsg(Pstudent pstudent){
         System.out.println("========================="+pstudent);
        rootService.updatastu(pstudent);
        return "redirect:/jsp/root.jsp";
    }
    //清空
    @RequestMapping("/root/clear")
    public String reappoint(String num){
        quitService.clearseat(num);
        quitService.clearstu(num);
        return "redirect:/jsp/root.jsp";
    }


    //后台座位
    @RequestMapping("/root/seatdelete")
    public String rootseatdel(String seatnum){
        rootSetService.deleteseat(seatnum);
        return "redirect:/jsp/root.jsp";
    }




    //公告-删除
    @RequestMapping("/root/messagedelete")
    public String rootmsgdel(String messagetext){
        rootSetService.deletmsg(messagetext);
        return "redirect:/jsp/root.jsp";
    }
    //咨询-删除
    @RequestMapping("/root/newsdelete")
    public String rootnewsdel(String newss){
        rootSetService.deletenews(newss);
        return "redirect:/jsp/root.jsp";
    }

}
