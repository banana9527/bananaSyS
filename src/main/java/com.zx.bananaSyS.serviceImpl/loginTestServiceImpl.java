package com.zx.bananaSyS.serviceImpl;

import com.zx.bananaSyS.dao.loginmapper;
import com.zx.bananaSyS.pojo.userCustom;
import com.zx.bananaSyS.service.loginTestService;
import Utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther mike
 * @create 2019-07-26 15:33
 */

@Service
public class loginTestServiceImpl implements loginTestService {

    @Autowired
    private loginmapper login_mapper;

    @Autowired
    private MD5Util md5Util;

    public userCustom loginTestByPassword(Integer id, String password) {

        String str = "";
        try {
             str = md5Util.getMD5String(password);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }


        userCustom userCustom = login_mapper.loginTestByPassword(id,str);

        return userCustom;
    }
}
