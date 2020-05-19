package com.fuhao.service;

import com.fuhao.dao.MessageMapper;
import com.fuhao.pojo.Message;
import com.fuhao.pojo.News;
import com.fuhao.pojo.Teacher;

import java.util.List;

public class MessageServiceImpl implements MessageService {
    private MessageMapper messageMapper;
    public List<Message> getMessageList() {
        return messageMapper.getMessageList();
    }

    public List<News> getNewsList() {
        return messageMapper.getNewsList();
    }

    public void setMessageMapper(MessageMapper messageMapper) {
        this.messageMapper=messageMapper;
    }

    public List<Teacher> getTeacherList() {
        return  messageMapper.getTeacherList();
    }
}
