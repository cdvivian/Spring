package com.cd.dao;

import com.cd.domain.Role;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface RoleDao {
    List<Role> findAll();

    void save(Role role);

    List<Role> findRoleByUserId(Long id);
}
