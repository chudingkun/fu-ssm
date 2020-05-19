package com.fuhao.pojo;

public class News {
    private String news;
    private String origin;
    private String time;

    public News(String news, String origin, String time) {
        this.news = news;
        this.origin = origin;
        this.time = time;
    }
    public News() {}

    @Override
    public String toString() {
        return "News{" +
                "news='" + news + '\'' +
                ", origin='" + origin + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
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
