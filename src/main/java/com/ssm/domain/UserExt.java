package com.ssm.domain;

import java.util.Date;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class UserExt extends User{
    private int oid;
    private int number;
    private double totalPrice;
    private Date createDate;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
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
        return "UserExt{" +
                "oid=" + oid +
                ", number=" + number +
                ", totalPrice=" + totalPrice +
                ", createDate=" + createDate +
                "} " + super.toString();
    }
}
