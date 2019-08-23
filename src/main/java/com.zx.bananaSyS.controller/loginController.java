package com.zx.bananaSyS.controller;

import com.zx.bananaSyS.pojo.role;
import com.zx.bananaSyS.pojo.userCustom;
import com.zx.bananaSyS.serviceImpl.findAllRoleServiceImpl;
import com.zx.bananaSyS.serviceImpl.loginTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-13 20:06
 */
@Controller
public class loginController {

    //index.jsp跳转controller
    @RequestMapping("hello.action")
    public ModelAndView helloController(){
        return new ModelAndView("login/login.jsp");
    }



    //简单登录验证controller
    @Autowired
    private loginTestServiceImpl loginTestService;

    @Autowired
    private findAllRoleServiceImpl findAllRoleService;


    /* show  their personal message including userTable and roleTable if they login success. */
    @RequestMapping("login.action")
    public ModelAndView loginController(Integer id, String password) {

        userCustom userCustom = loginTestService.loginTestByPassword(id, password);
        if (userCustom == null) {
            return new ModelAndView("login/error.jsp");
        } else {
            role role = findAllRoleService.findRole(userCustom.getRole());
            userCustom.setRoleName(role.getRoleName());
            userCustom.setRoleDesc(role.getRoleDesc());

            return new ModelAndView("login/loginSuc.jsp", "user", userCustom);
        }
    }


    //默认主页面welcome.html的controller
    @RequestMapping("welcome.action")
    public ModelAndView welcomeController() {

        return new ModelAndView("login/welcome.jsp");

    }
}
