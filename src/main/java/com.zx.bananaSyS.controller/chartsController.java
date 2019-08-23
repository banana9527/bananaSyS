package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-16 12:37
 */
@Controller
public class chartsController {
    @RequestMapping("charts-1.action")
    public ModelAndView chartsOneController(){
        return new ModelAndView("charts/charts-1.jsp");
    }
    @RequestMapping("charts-2.action")
    public ModelAndView chartsTwoController(){
        return new ModelAndView("charts/charts-2.jsp");
    }
    @RequestMapping("charts-3.action")
    public ModelAndView chartsThreeController(){
        return new ModelAndView("charts/charts-3.jsp");
    }
    @RequestMapping("charts-4.action")
    public ModelAndView chartsFourController(){
        return new ModelAndView("charts/charts-4.jsp");
    }
    @RequestMapping("charts-5.action")
    public ModelAndView chartsFiveController(){
        return new ModelAndView("charts/charts-5.jsp");
    }
    @RequestMapping("charts-6.action")
    public ModelAndView chartsSixController(){
        return new ModelAndView("charts/charts-6.jsp");
    }
    @RequestMapping("charts-7.action")
    public ModelAndView chartsSevenController(){
        return new ModelAndView("charts/charts-7.jsp");
    }
}
