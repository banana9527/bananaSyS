package com.zx.bananaSyS.service;

import com.zx.bananaSyS.pojo.role;

import java.util.List;

/**
 * @auther mike
 * @create 2019-08-14 14:34
 */
public interface findAllRoleService {
    List<role> findAllRole();

    role findRole(int roleId);
}
