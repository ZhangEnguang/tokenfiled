package com.eplugger.controller;

import com.eplugger.entity.Student;
import com.eplugger.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService service;
    @RequestMapping(value = "/goHello")
    private String goEchars(){
        return "hello";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> save(@RequestBody Student student){
        Map<String,Object> map = new HashMap<>();
        if (service.add(student)){
            map.put("status",true);
        }else {
            map.put("status",false);
        }
        return map;
    }
}
