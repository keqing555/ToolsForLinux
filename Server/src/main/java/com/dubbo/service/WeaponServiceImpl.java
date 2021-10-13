package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.bean.Weapon;

import java.util.ArrayList;
import java.util.List;

//使用Dubbo的Service
@Service
public class WeaponServiceImpl implements WeaponService {
    //实现接口需要先导入接口的包

    @Override
    public List<Weapon> getWeaponByRid(int rid) {
        List<Weapon> list = new ArrayList<>();
        Weapon weapon1 = new Weapon(1, "匣里龙吟", rid);
        Weapon weapon2 = new Weapon(2, "西风大剑", rid);
        Weapon weapon3 = new Weapon(3, "Referencr获取实例方式，注解配置方式设置参数", rid);
        list.add(weapon1);
        list.add(weapon2);
        list.add(weapon3);
        return list;
    }
}
