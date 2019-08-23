package com.zx.bananaSyS.controller;

import com.zx.bananaSyS.pojo.role;
import com.zx.bananaSyS.serviceImpl.findUserServiceImpl;
import com.zx.bananaSyS.serviceImpl.updateUserRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @auther mike
 * @create 2019-08-15 15:18
 */
@Controller
public class adminController {

    @Autowired
    private findUserServiceImpl service;

    @Autowired
    private updateUserRoleServiceImpl updateUserRoleService;

    @RequestMapping("admin-list.action")
    public ModelAndView adminListController(){
        List userList = service.findUserForAdminList();

        return new ModelAndView("admin/admin-list.jsp","userList",userList);
    }


    @RequestMapping("admin-add.action")
    public ModelAndView adminAddController(){
        return new ModelAndView("admin/admin-add.jsp");
    }

    @ResponseBody
    @RequestMapping("admin-updateUserRole.action")
    public void adminAddRoleController(Integer adminName, Integer adminRole) {
        try {
            updateUserRoleService.updateUserRoleById(adminName,adminRole);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {

        }
    }

    @RequestMapping("admin-deleteUserRole.action")
    @ResponseBody
    public void adminDeleteUserRoleController(Integer adminName){
        try {
            updateUserRoleService.deleteUserRoleById(adminName,5);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
//            return new ModelAndView("login/welcome.jsp");
        }
    }

    @RequestMapping("admin-role-add.action")
    public ModelAndView adminRoleAdd(){
        return new ModelAndView("admin/admin-role-add.jsp");
    }
}
