package com.fuhao.service;

import com.fuhao.dao.QuitMapper;

public class QuitServiceImpl implements QuitService {

    private QuitMapper quitMapper;

    public void setQuitMapper(QuitMapper quitMapper) {
        this.quitMapper = quitMapper;
    }

    public int clearstu(String num) {
        return quitMapper.clearstu(num);
    }

    public int clearseat(String num) {
        return quitMapper.clearseat(num);
    }
}
