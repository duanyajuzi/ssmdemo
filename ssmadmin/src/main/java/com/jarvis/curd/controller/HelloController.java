package com.jarvis.curd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/helloworld")
    public String helloworld(Model model){
        model.addAttribute("message", "Hello World!");
        return "hello";
    }
    @RequestMapping("/login")
    public ModelAndView index(){
         return new ModelAndView("login");
    }

}
