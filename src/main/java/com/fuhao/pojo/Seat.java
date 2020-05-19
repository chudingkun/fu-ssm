package com.fuhao.pojo;

public class Seat {
    private String floor;
    private String wz;
    private String seatnum;
    private  String temp;
    private  int num;

    public Seat(String floor, String wz, String seatnum, String temp, int num) {
        this.floor = floor;
        this.wz = wz;
        this.seatnum = seatnum;
        this.temp = temp;
        this.num = num;
    }
    public Seat() {
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWz() {
        return wz;
    }

    public void setWz(String wz) {
        this.wz = wz;
    }

    public String getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(String seatnum) {
        this.seatnum = seatnum;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
