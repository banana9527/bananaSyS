package com.zx.bananaSyS.dao;

import com.zx.bananaSyS.pojo.user;
import com.zx.bananaSyS.pojo.userCustom;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther mike
 * @create 2019-07-24 16:57
 */

@Repository
public interface usermapper {
    /*find user by id.*/
    @Select("select * from sys_user where id=#{id}")
    user findUserById(int id);

    /*find user by role_id*/
    @Select("SELECT name from sys_user WHERE role=#{roleId}")
    List<String> findUserByRoleId(int roleId);

    /*find user for adminList*/
    @Select("select sys_user.id,sys_user.name,sys_user.phone,sys_user.email,sys_role.roleName,sys_user.regTime from sys_user,sys_role where sys_role.roleId<5 AND sys_user.role=sys_role.roleId")
    List<userCustom> findUserForAdminList();



}
