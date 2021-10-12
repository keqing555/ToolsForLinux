package com.dubbo.bean;

import java.io.Serializable;
import java.util.List;

public class Weapon implements Serializable {
    private int wid;
    private String wname;
    private int rid;

    public Weapon() {
    }

    public Weapon(int wid, String wname, int rid) {
        this.wid = wid;
        this.wname = wname;
        this.rid = rid;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "\n Weapon{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", rid=" + rid +
                '}' + "\n";
    }
}
