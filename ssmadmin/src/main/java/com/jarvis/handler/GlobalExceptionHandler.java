package com.jarvis.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //可具体写每个想要处理的异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object>exceptionHandler(HttpServletRequest req,Exception e){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        modelMap.put("success",false);
        modelMap.put("errMsg",e.getMessage());
        return modelMap;
    }
}
