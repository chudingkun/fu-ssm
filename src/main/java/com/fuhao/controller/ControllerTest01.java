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


    @GetMapping("/ssm/test01")
    public String test01(Model model) {
        User user = userService.getUserById(1);
        model.addAttribute("list",user);
        return "test01";
    }
    @GetMapping("/ssm/qureyall")
    public String test02(Model model) {
        List<User> listuser =  userService.getUserList();

        model.addAttribute("list",listuser);
        return "test01";
    }
    @GetMapping("/ssm/addUser")
    public String add(){
        return "addUser";
    }
    @PostMapping("/ssm/addUserReal")
    public String addUser(User user) {
        System.out.println("===>"+user);
        userService.addUser(user);
        return "redirect:/ssm/qureyall";
    }
    User user1 =new User();
    @GetMapping("/ssm/updata")
    public String updata(int id,Model model) {
        User user1 =userService.getUserById(id);
        model.addAttribute("user",user1);
        return "updata";
    }
    @PostMapping ("/ssm/updataUser")
    public String updataUser(User user){
        userService.updataUser(user);
        return "redirect:/ssm/qureyall";
    }
    @GetMapping ("/ssm/delete")
    public String updataUser(int id){
        userService.deleteUser(id);
        return "redirect:/ssm/qureyall";
    }
    @PostMapping("/ssm/querrygo")
    public String queryid(String queryid,Model model){
        int id= Integer.parseInt(queryid);
        User user =userService.getUserById(id);
        if(user==null){
           model.addAttribute("msg","未查询到");
           return "queryid";
        }
        model.addAttribute("user",user);
        return "queryid";
    }

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
