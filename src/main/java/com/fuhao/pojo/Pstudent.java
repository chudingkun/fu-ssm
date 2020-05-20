package com.fuhao.pojo;

public class Pstudent {
    private String num;
    private  String password;

    public Pstudent(String num, String password) {
        this.num = num;
        this.password = password;
    }
    public Pstudent() {

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
