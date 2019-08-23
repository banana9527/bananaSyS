package com.zx.bananaSyS.controller;

import com.zx.bananaSyS.serviceImpl.findAllRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * @auther mike
 * @create 2019-08-13 23:09
 */
@Controller
public class roleController {

    @Autowired
   private findAllRoleServiceImpl service;

    @RequestMapping("admin-role.action")
    public ModelAndView roleListController(){
        //所有角色列表
        List roleList= service.findAllRole();

        return new ModelAndView("admin/admin-role.jsp","allRole", roleList);
    }
}
