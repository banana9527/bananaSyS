package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-16 12:30
 */
@Controller
public class memberController {

    @RequestMapping("member-list.action")
    public ModelAndView memberListController(){
        return new ModelAndView("member/member-list.jsp");
    }
    @RequestMapping("member-del.action")
    public ModelAndView memberDelController(){
        return new ModelAndView("member/member-del.jsp");
    }
    @RequestMapping("member-record-browse.action")
    public ModelAndView memberRecordBrowseController(){
        return new ModelAndView("member/member-record-browse.jsp");
    }
    @RequestMapping("member-record-download.action")
    public ModelAndView memberRecordDownloadController(){
        return new ModelAndView("member/member-record-download.jsp");
    }
    @RequestMapping("member-record-share.action")
    public ModelAndView memberRecordShareController(){
        return new ModelAndView("member/member-record-share.jsp");
    }
    @RequestMapping("member-add.action")
    public ModelAndView memberAddController(){
        return new ModelAndView("member/member-add.jsp");
    }
}
