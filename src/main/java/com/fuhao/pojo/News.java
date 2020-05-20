package com.fuhao.pojo;

public class News {
    private String newss;
    private String origin;
    private String time;

    public News(String newss, String origin, String time) {
        this.newss = newss;
        this.origin = origin;
        this.time = time;
    }
    public News() {}

    @Override
    public String toString() {
        return "News{" +
                "news='" + newss + '\'' +
                ", origin='" + origin + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public String getNewss() {
        return newss;
    }

    public void setNews(String news) {
        this.newss = news;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
