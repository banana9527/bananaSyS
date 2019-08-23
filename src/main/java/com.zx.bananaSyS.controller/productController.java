package com.zx.bananaSyS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther mike
 * @create 2019-08-16 12:21
 */
@Controller
public class productController {

    @RequestMapping("product-brand.action")
    public ModelAndView productBrandController(){

        return new ModelAndView("product/product-brand.jsp");

    }
    @RequestMapping("product-category.action")
    public ModelAndView productCategoryController(){
        return new ModelAndView("product/product-category.jsp");
    }
    @RequestMapping("product-list.action")
    public ModelAndView productListController(){
        return new ModelAndView("product/product-list.jsp");
    }
    @RequestMapping("product-category-add.action")
    public ModelAndView productCategoryAddController(){
        return new ModelAndView("product/product-category-add.jsp");
    }
    @RequestMapping("product-add.action")
    public ModelAndView productAddController(){
        return new ModelAndView("product/product-add.jsp");
    }
}
