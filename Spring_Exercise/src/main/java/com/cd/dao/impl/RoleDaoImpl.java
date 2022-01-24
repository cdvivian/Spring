package com.cd.dao.impl;

import com.cd.dao.RoleDao;
import com.cd.domain.Role;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public class RoleDaoImpl implements RoleDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Role> findAll() {
        List<Role> roleList = jdbcTemplate.query("select * form sys_role", new BeanPropertyRowMapper<Role>());
        return roleList;
    }

    public void save(Role role) {
        jdbcTemplate.update("insert into sys_role values(?,?,?)",null,role.getRoleName(),role.getRoleDesc());
    }

    public List<Role> findRoleByUserId(Long id) {
        List<Role> roleList = jdbcTemplate.query("select * from select * from sys_user_role ur,sys_role r where ur.roleId=r.id and ur.userId=?", new BeanPropertyRowMapper<Role>(), id);
        return roleList;
    }
}
