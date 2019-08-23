package com.zx.bananaSyS.dao;

import com.zx.bananaSyS.pojo.userCustom;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @auther mike
 * @create 2019-07-26 15:26
 */
@Repository
public interface loginmapper {

    @Select("select * from sys_user where id=#{param1} and password=#{param2}")
    userCustom loginTestByPassword(Integer id, String password);
}
