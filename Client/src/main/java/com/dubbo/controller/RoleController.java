package com.dubbo.controller;

import com.dubbo.bean.Role;
import com.dubbo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("getRoleByRid")
    @ResponseBody
    public Role getRoleByRid(int rid) {
        return roleService.getRoleByRid(rid);
    }
}
