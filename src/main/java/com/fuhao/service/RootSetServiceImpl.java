package com.fuhao.service;

import com.fuhao.dao.RootSetMapper;

public class RootSetServiceImpl implements RootSetService {
    private RootSetMapper rootSetMapper;

    public void setRootSetMapper(RootSetMapper rootSetMapper) {
        this.rootSetMapper = rootSetMapper;
    }

    public int deletestu(String num) {
        return rootSetMapper.deletestu(num);
    }

    public int deleteseat(String seatnum) {
        return rootSetMapper.deleteseat(seatnum);
    }

    public int deletmsg(String messagetext) {
        return rootSetMapper.deletmsg(messagetext);
    }

    public int deletenews(String news) {
        return rootSetMapper.deletenews(news);
    }
}
