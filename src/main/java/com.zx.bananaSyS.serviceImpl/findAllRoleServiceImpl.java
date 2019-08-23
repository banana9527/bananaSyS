package com.zx.bananaSyS.serviceImpl;

import Utils.RedisUtils;
import com.zx.bananaSyS.dao.rolemapper;
import com.zx.bananaSyS.dao.usermapper;
import com.zx.bananaSyS.pojo.role;
import com.zx.bananaSyS.pojo.roleCustom;
import com.zx.bananaSyS.service.findAllRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @auther mike
 * @create 2019-08-14 14:39
 */
@Service
public class findAllRoleServiceImpl implements findAllRoleService {

    @Autowired
    private rolemapper role_mapper;
    @Autowired
    private usermapper user_mapper;
    @Autowired
    private RedisUtils redisUtils;


    //show all role

    public List findAllRole() {


        List<roleCustom> list = role_mapper.findAllRole();


        for (int i = 0; i < list.size(); i++) {

            int role_id = list.get(i).getRoleId();

            List<String> tmp = user_mapper.findUserByRoleId(role_id);

            StringBuilder allRoleName = new StringBuilder();
            for (String name: tmp) {
                allRoleName.append(name+" ");
            }
            list.get(i).setUsername(allRoleName+"");
        }

        return list;
    }



    //find a role for login.jsp
    public role findRole(int roleId){
        role role = role_mapper.findRole(roleId);
        return role;
    }
}



      /* redis实现缓存机制方法*/
//    public role findRole(int roleId){
//        redisUtils = RedisUtils.getRedis();
//        role role = new role();
//        long len = redisUtils.getListLength("singleRole");//-1 ->不存在
//        if(-1 == len){
//            // not exist in redis , find from db.
//            role = role_mapper.findRole(roleId);
//            redisUtils.setList("singleRole",role.getRoleName(),role.getRoleDesc());
//        }else {
//            //redis exists.
//            List<String> list = redisUtils.getList("singleRole");
//            System.out.println(list);
//            role.setRoleName(list.get(0));
//            role.setRoleDesc(list.get(1));
//        }
//        return role;
//    }









//    public List findAllRole() {
//
//        redisUtils = RedisUtils.getRedis();
//        if( -1 == redisUtils.getListLength("all_role")){
//            //not exist , find from DataBase.
//
//            List<roleCustom> list = role_mapper.findAllRole();
//
//            for (int i = 0; i < list.size(); i++) {
//
//                int role_id = list.get(i).getRoleId();
//
//                List<String> tmp = user_mapper.findUserByRoleId(role_id);
//
//                StringBuilder allRoleName = new StringBuilder();
//                for (String name: tmp) {
//                    allRoleName.append(name+" ");
//                }
//                list.get(i).setUsername(allRoleName+"");
//            }
//            return list;
//        }else{
//            List<String> list = redisUtils.getList("all_role");
//
//            return list;
//        }
//    }
