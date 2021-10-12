package com.dubbo.bean;

import java.io.Serializable;
import java.util.List;

public class Pool implements Serializable {
    private String poolName;
    private List<Role> roleList;

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "\n Pool{" +
                "\n poolName='" + poolName + '\'' +
                ",\n roleList=" + roleList +
                '}' + "\n";
    }
}
