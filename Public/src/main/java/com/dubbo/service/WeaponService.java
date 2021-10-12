package com.dubbo.service;

import com.dubbo.bean.Weapon;

import java.util.List;

public interface WeaponService {
    List<Weapon> getWeaponByRid(int rid);
}
