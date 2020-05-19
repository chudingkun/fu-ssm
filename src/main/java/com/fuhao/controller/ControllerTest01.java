package com.fuhao.controller;

import com.fuhao.pojo.Message;
import com.fuhao.pojo.News;
import com.fuhao.pojo.Teacher;
import com.fuhao.pojo.User;
import com.fuhao.service.MessageService;
import com.fuhao.service.UserService;
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
import java.util.List;

@Controller
public class ControllerTest01 {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @Autowired
    @Qualifier("MessageServiceImpl")
    private MessageService messageService;


    //登陆
    @PostMapping("/ssm/login")
    public String testlogin(User user, Model model, HttpServletRequest request, HttpServletResponse response){
        HttpSession session =request.getSession();
        List<Message> messageList=messageService.getMessageList();
        List<News> newsList=messageService.getNewsList();
        List<Teacher> teachers = messageService.getTeacherList();
        model.addAttribute("messagelist",messageList);
        model.addAttribute("newslist",newsList);
        model.addAttribute("teachers",teachers);
        if(userService.login(user)!=null){
            session.setAttribute("id",userService.login(user).getId());
            session.setAttribute("username",userService.login(user).getName());
                return "index";
        }else {
                return "error";
        }
    }

}
