package org.wcf.demo.mapper;

import org.wcf.demo.pojo.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> findRoleByCondtion();
}
