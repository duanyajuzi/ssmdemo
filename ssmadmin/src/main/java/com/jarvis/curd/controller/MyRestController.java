package com.jarvis.curd.controller;

import com.jarvis.curd.entity.MyRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MyRestController {
    private static final String template="Hello,%s!";
    private final AtomicLong counter=new AtomicLong();
    @RequestMapping("/myrest")
    public MyRest myrest(@RequestParam(value = "name",defaultValue = "World")String name){
        return new MyRest(counter.incrementAndGet(),String.format(template,name));
    }
}
