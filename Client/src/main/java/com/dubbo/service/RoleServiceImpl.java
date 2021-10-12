package com.dubbo.service;

import com.dubbo.bean.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public Role getRoleByRid(int rid) {
        Role role = new Role(rid, "刻晴", "璃月");

        return role;
    }
}
