package com.fuhao.pojo;

public class Pseat {
    private String floor;
    private String wz;
    private String seatnum;

    public Pseat(String floor, String wz, String seatnum) {
        this.floor = floor;
        this.wz = wz;
        this.seatnum = seatnum;
    }
    public Pseat() {

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
}
