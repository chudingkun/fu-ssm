package com.fuhao.pojo;

public class Teacher {
    private  int floor;
    private String name;
    private String time;
    private String temp;
    private String tel;

    @Override
    public String toString() {
        return "Teacher{" +
                "floor=" + floor +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", temp='" + temp + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Teacher(int floor, String name, String time, String temp, String tel) {
        this.floor = floor;
        this.name = name;
        this.time = time;
        this.temp = temp;
        this.tel = tel;
    }
    public Teacher() {

    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
