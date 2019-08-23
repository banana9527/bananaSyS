package com.zx.bananaSyS.service;

import com.zx.bananaSyS.pojo.user;
import com.zx.bananaSyS.pojo.userCustom;

import java.util.List;

/**
 * @auther mike
 * @create 2019-07-26 14:35
 */

public interface findUserService {
    user findUserById(int id);

    List<userCustom> findUserForAdminList();
}
