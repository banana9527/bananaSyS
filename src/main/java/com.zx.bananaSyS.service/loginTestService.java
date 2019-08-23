package com.zx.bananaSyS.service;

import com.zx.bananaSyS.pojo.userCustom;

/**
 * @auther mike
 * @create 2019-07-26 15:31
 */
public interface loginTestService {
    userCustom loginTestByPassword(Integer id, String password);
}
