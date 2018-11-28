package com.springdemo.entity;

import java.io.Serializable;

public class Role implements Serializable {

    private String id;

    private String nickname;

    private int level;

    private int exper;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExper() {
        return exper;
    }

    public void setExper(int exper) {
        this.exper = exper;
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
                ", level=" + level +
                ", vip=" + vip +
                ", clothingId='" + clothingId + '\'' +
                ", friendId='" + friendId + '\'' +
                ", taskId='" + taskId + '\'' +
                '}';
    }
}
