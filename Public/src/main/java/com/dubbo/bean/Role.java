package com.dubbo.bean;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
    private int rid;
    private String rname;
    private List<Weapon> weaponList;

    public Role() {
    }

    public Role(int rid, String rname, List<Weapon> weaponList) {
        this.rid = rid;
        this.rname = rname;
        this.weaponList = weaponList;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    @Override
    public String toString() {
        return "\n Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", \n weaponList=" + weaponList +
                '}' + "\n";
    }
}
