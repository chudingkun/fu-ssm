package com.fuhao.pojo;

public class Root {
    private String name;
    private String password;
    private String tel;

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public Root(String name, String password, String tel) {
        this.name = name;
        this.password = password;
        this.tel = tel;
    }
    public Root() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
