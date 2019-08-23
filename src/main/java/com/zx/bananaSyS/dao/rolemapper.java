package com.zx.bananaSyS.dao;

import com.zx.bananaSyS.pojo.role;
import com.zx.bananaSyS.pojo.roleCustom;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther mike
 * @create 2019-08-14 14:29
 */

@Repository
public interface rolemapper {

    @Select("SELECT * FROM sys_role")
    List<roleCustom> findAllRole();

    @Select("SELECT roleName,roleDesc FROM sys_role WHERE roleId=#{roleId}")
    role findRole(int roleId);

    @Update("UPDATE sys_user SET role=#{param2} where id=#{param1}")
    void updateUserRole(Integer id,Integer roleId);

}
