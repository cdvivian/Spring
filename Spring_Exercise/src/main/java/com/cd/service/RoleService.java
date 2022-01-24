package com.cd.service;

import com.cd.domain.Role;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface RoleService {
    public List<Role> list();

    void save(Role role);
}
