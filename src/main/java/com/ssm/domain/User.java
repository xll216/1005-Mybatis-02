package com.ssm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private String sex;
    private Date birthday;
    private String address;

    /*该用户对应的订单集合*/
    private List<Orders> orderss;

    public User() {
    }

    public User(String username, String password, String sex, Date birthday, String address) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }

    public List<Orders> getOrderss() {
        return orderss;
    }

    public void setOrderss(List<Orders> orderss) {
        this.orderss = orderss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
