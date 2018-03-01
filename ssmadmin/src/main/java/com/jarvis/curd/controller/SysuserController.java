package com.jarvis.curd.controller;

import com.jarvis.curd.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysuser")
public class SysuserController {
    @Autowired
    private SysuserService sysuserService;
    @RequestMapping("/getSysuser")
    public String getSysuser(){
        System.out.println(sysuserService.getSysuser("1"));
        return sysuserService.getSysuser("1").toString();
    }
}
