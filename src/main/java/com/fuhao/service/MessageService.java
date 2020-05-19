package com.fuhao.service;

import com.fuhao.pojo.Message;
import com.fuhao.pojo.News;
import com.fuhao.pojo.Teacher;

import java.util.List;

public interface MessageService {
    List<Message> getMessageList();
    List<News> getNewsList();
    List<Teacher> getTeacherList();
}
