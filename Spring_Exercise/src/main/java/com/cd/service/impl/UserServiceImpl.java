package com.cd.service.impl;

import com.cd.dao.impl.RoleDaoImpl;
import com.cd.dao.impl.UserDaoImpl;
import com.cd.domain.Role;
import com.cd.domain.User;
import com.cd.service.UserService;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao;
    private RoleDaoImpl roleDao;

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void setRoleDao(RoleDaoImpl roleDao) {
        this.roleDao = roleDao;
    }

    public List<User> list() {
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            //获得user的id
            Long id = user.getId();
            //将id作为参数 查询当前userId对应的Role集合数据
            List<Role> roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    public void save(User user, Long[] roleIds) {
        //第一步 向sys_user表中存储数据
        Long userId = userDao.save(user);
        //第二步 向sys_user_role 关系表中存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);
    }

    public void del(Long userId) {
//1、删除sys_user_role关系表
        userDao.delUserRoleRel(userId);
        //2、删除sys_user表
        userDao.del(userId);
    }
}
