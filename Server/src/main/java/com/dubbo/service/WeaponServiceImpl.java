package com.dubbo.service;

import com.dubbo.bean.Weapon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//使用Spring的Service
@Service
public class WeaponServiceImpl implements WeaponService {
    //实现接口需要先导入接口的包

    @Override
    public List<Weapon> getWeaponByRid(int rid) {
        List<Weapon> list = new ArrayList<>();
        Weapon weapon1 = new Weapon(1, "匣里龙吟", rid);
        Weapon weapon2 = new Weapon(2, "黑剑", rid);
        Weapon weapon3 = new Weapon(3, "Autowired获取实例方式，dubbo配置文件设置参数", rid);
        // Weapon weapon3 = new Weapon(3, "@Reference获取实例方式，且由该注解配置参数", rid);
        list.add(weapon1);
        list.add(weapon2);
        list.add(weapon3);
        return list;
    }
}
