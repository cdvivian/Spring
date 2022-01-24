package com.cd.dao;

import com.cd.domain.User;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface UserDao {
    List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long userId, Long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);
}
