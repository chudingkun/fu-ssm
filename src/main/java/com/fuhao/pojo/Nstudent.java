package com.fuhao.pojo;

public class Nstudent {
    private String num;
    private String password;

    public Nstudent(String num, String password) {
        this.num = num;
        this.password = password;
    }
    public Nstudent() {
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
