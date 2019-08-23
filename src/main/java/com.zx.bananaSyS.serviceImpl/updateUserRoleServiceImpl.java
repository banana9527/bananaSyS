package com.zx.bananaSyS.serviceImpl;

import com.zx.bananaSyS.dao.rolemapper;
import com.zx.bananaSyS.service.updateUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther mike
 * @create 2019-08-20 15:57
 */

@Service
public class updateUserRoleServiceImpl implements updateUserRoleService {

    @Autowired
    private rolemapper mapper;

    @Override
    public void updateUserRoleById(Integer id, Integer roleId) {
        mapper.updateUserRole(id,roleId);
    }

    @Override
    public void deleteUserRoleById(Integer id, Integer roleId) {
        mapper.updateUserRole(id,roleId);
    }

}
