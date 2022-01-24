package com.cd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author cdviviany
 * @version 1.00
 */

@Controller
public class TargetController {

    @RequestMapping("/target1")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","harry");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}