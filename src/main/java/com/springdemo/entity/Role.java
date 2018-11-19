package com.springdemo.entity;

import java.io.Serializable;

public class Role implements Serializable {

    private String id;

    private int energy;

    private int money;

    private int diamond;

    private int star;

    private int level;

    private int vip;

    private String clothingId;

    private String friendId;

    private String taskId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public String getClothingId() {
        return clothingId;
    }

    public void setClothingId(String clothingId) {
        this.clothingId = clothingId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", energy=" + energy +
                ", money=" + money +
                ", diamond=" + diamond +
                ", star=" + star +
                ", level=" + level +
                ", vip=" + vip +
                ", clothingId='" + clothingId + '\'' +
                ", friendId='" + friendId + '\'' +
                ", taskId='" + taskId + '\'' +
                '}';
    }
}
