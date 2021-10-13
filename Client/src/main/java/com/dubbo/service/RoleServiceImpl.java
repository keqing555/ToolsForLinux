package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.bean.Role;
import com.dubbo.bean.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    //从dubbo注册中心获取实例
    //@Reference(retries = 2, timeout = 60000, loadbalance = "roundrobin")
     @Autowired   //从Spring容器获取实例
    private WeaponService weaponService;

    @Override
    public Role getRoleByRid(int rid) {
        Role role = new Role(rid, "刻晴", null);
        if (weaponService != null) {
            List<Weapon> weaponList = weaponService.getWeaponByRid(rid);
            role.setWeaponList(weaponList);
        }
        return role;
    }
}
