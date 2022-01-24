package com.cd.service;

import com.cd.domain.User;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface UserService {
    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);
}
