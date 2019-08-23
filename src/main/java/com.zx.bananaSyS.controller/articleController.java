package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-16 12:17
 */
@Controller
public class articleController {
    @RequestMapping("article-list.action")
    public ModelAndView articleListController(){
        return new ModelAndView("article/article-list.jsp");
    }
    @RequestMapping("article-add.action")
    public ModelAndView articleAddController(){
        return new ModelAndView("article/article-add.jsp");
    }
}
