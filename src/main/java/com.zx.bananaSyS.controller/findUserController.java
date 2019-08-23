package com.zx.bananaSyS.controller;

import com.zx.bananaSyS.pojo.user;
import com.zx.bananaSyS.serviceImpl.findUserServiceImpl;
import com.zx.bananaSyS.serviceImpl.loginTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-07-26 14:39
 */
@Controller
public class findUserController {

    @Autowired
    private findUserServiceImpl service;

    @RequestMapping("findUserById.action")
    public ModelAndView findUserById() throws Exception {

        user user = service.findUserById(10000);

        return new ModelAndView("findSuc", "user", user);
    }

}