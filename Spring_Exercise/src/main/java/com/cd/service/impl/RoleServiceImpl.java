package com.cd.service.impl;

import com.cd.dao.RoleDao;
import com.cd.domain.Role;
import com.cd.service.RoleService;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }

    public void save(Role role) {
        roleDao.save(role);
    }
}
