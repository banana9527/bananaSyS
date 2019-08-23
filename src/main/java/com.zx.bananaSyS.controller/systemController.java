package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-16 12:40
 */
@Controller
public class systemController {
    @RequestMapping("system-base.action")
    public ModelAndView systemBaseController(){
        return new ModelAndView("system/system-base.jsp");
    }
    @RequestMapping("system-category.action")
    public ModelAndView systemCategoryController(){
        return new ModelAndView("system/system-category.jsp");
    }
    @RequestMapping("system-data.action")
    public ModelAndView systemDataController(){
        return new ModelAndView("system/system-data.jsp");
    }

    @RequestMapping("system-shielding.action")
    public ModelAndView systemShieldingController(){
        return new ModelAndView("system/system-shielding.jsp");
    }

    @RequestMapping("system-log.action")
    public ModelAndView systemLogController(){
        return new ModelAndView("system/system-log.jsp");
    }

}
