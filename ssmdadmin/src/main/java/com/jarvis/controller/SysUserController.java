
package com.jarvis.controller;

import com.jarvis.entity.SysUser;
import com.jarvis.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jarvis on 2018/1/11.
 * @version v1.0
 */
@Controller
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/getUser/{userid}")
    public SysUser getUserByid(@PathVariable String userid){
        return sysUserService.getUserByid(userid);
    };
    @RequestMapping("/t")
    public void test1(){
        System.out.printf("111");
    }
}
