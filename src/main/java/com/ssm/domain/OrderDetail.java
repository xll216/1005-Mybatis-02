package com.ssm.domain;

import java.io.Serializable;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class OrderDetail implements Serializable {
    private int id;
    private int itemCount;
    private double itemPrice;
    private double totalPrice;

    /*当前明细对应的商品对象，一对一的关系*/
    private Item item;

    public OrderDetail() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", itemCount=" + itemCount +
                ", itemPrice=" + itemPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
