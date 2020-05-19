package com.fuhao.dao;

import com.fuhao.pojo.Message;
import com.fuhao.pojo.News;
import com.fuhao.pojo.Teacher;

import java.util.List;

public interface MessageMapper {
    List<Message> getMessageList();
    List<News> getNewsList();
    List<Teacher> getTeacherList();
}
