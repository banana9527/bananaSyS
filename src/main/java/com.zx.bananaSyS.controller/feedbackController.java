package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-16 12:28
 */
@Controller
public class feedbackController {
    @RequestMapping("feedback-list.action")
    public ModelAndView feedbackListController(){
        return new ModelAndView("feedback/feedback-list.jsp");
    }
}
