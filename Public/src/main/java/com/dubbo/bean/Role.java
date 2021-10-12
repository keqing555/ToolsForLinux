package com.dubbo.bean;

import java.io.Serializable;

public class Role implements Serializable {
    private int rid;
    private String name;
    private String area;

    public Role() {
    }

    public Role(int rid, String name, String area) {
        this.rid = rid;
        this.name = name;
        this.area = area;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
