package com.springdemo.entity;

import java.io.Serializable;

public class Assets implements Serializable {
    private String id;

    private int energy;

    private int money;

    private int diamond;

    private int star;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Assets{" +
                "id='" + id + '\'' +
                ", energy=" + energy +
                ", money=" + money +
                ", diamond=" + diamond +
                ", star=" + star +
                '}';
    }
}
