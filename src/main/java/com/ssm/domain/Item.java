package com.ssm.domain;

import java.io.Serializable;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class Item implements Serializable {
    private int id;
    private String name;
    private String color;
    private double price;
    private String produce;

    public Item() {
    }

    public Item(String name, String color, double price, String produce) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.produce = produce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", produce='" + produce + '\'' +
                '}';
    }
}
