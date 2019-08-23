package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-15 15:04
 */
@Controller
public class permissionController {

    @RequestMapping("admin-permission.action")
    public ModelAndView permissionListController(){
        return new ModelAndView("admin/admin-permission.jsp");
    }
}
