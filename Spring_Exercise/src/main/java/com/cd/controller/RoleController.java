package com.cd.controller;

import com.cd.domain.Role;
import com.cd.service.RoleService;
import com.cd.service.impl.RoleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
@RequestMapping("/role")
@Controller
public class RoleController {
    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }


    @RequestMapping("/save")
    public String save(Role role){
        roleService.save(role);
        return "redirect:role-list";
    }
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Role> roleList = roleService.list();
        modelAndView.addObject("roleList",roleList);
        //设置视图
        modelAndView.setViewName("role-list");
        return modelAndView;
    }
}
