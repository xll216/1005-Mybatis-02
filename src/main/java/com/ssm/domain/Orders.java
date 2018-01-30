package com.ssm.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class Orders implements Serializable {
    private int id;
    private int number;
    private double totalPrice;
    private Date createDate;

    public Orders() {
    }

    public Orders(int number, double totalPrice, Date createDate) {
        this.number = number;
        this.totalPrice = totalPrice;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number=" + number +
                ", totalPrice=" + totalPrice +
                ", createDate=" + createDate +
                '}';
    }
}
