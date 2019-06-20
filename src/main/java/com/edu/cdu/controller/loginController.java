package com.edu.cdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/index")
@Controller
public class loginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index(){
        System.out.println("进入control");
        return "index";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public ModelAndView index(ModelAndView model){
//        model.setViewName("login");
//        model.addObject("user","齐天大圣");
//        return model;
//    }
}
