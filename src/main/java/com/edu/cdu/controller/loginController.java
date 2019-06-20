package com.edu.cdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/login")
@Controller
public class loginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index(){
        return "hhhhhhhhhhhhhhhhhhhh";
    }
}
