package com.zx.bananaSyS.serviceImpl;

import com.zx.bananaSyS.dao.usermapper;
import com.zx.bananaSyS.pojo.user;
import com.zx.bananaSyS.pojo.userCustom;
import com.zx.bananaSyS.service.findUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther mike
 * @create 2019-07-26 14:36
 */

@Service
public class findUserServiceImpl implements findUserService {

    @Autowired
    private usermapper mapper;


    /*find a user by id*/
    public user findUserById(int id) {
        user user = mapper.findUserById(id);
        return user;
    }




    /*find users who are admin-role */
    public List<userCustom> findUserForAdminList() {
       List list = mapper.findUserForAdminList();
       return list;
    }
}
