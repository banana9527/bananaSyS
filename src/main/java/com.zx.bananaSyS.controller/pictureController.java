package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-16 12:19
 */
@Controller
public class pictureController {
    @RequestMapping("picture-list.action")
    public ModelAndView pictureListController(){
        return new ModelAndView("picture/picture-list.jsp");
    }
}
