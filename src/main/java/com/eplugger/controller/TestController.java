package com.eplugger.controller;

import com.eplugger.entity.Student;
import com.eplugger.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService service;
    @RequestMapping(value = "/goHello")
    private String goEchars(Model model,String hobby){
        hobby= hobby==null ? "" : hobby;
        List<Student> resList = new ArrayList<>();
        if (!StringUtils.isEmpty(hobby)){
            String[] split = hobby.split(",");
            for (String s : split) {
                List<Student> list = service.search(s.trim());
                resList.addAll(list);
            }
        }else {
            resList = service.search(hobby);
        }
        model.addAttribute("list",resList);
        model.addAttribute("hobby",hobby);
        return "hello";
    }
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    private String update(Model model,Integer id){
       Student student = this.service.selectById(id);
       model.addAttribute("student",student);
        return "update";
    }
    @RequestMapping(value = "/doUpdate",method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> update(@RequestBody Student student){
        Map<String,Object> map = new HashMap<>();
        if (service.updateById(student)){
            map.put("status",true);
        }else {
            map.put("status",false);
        }
        return map;
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
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> del(Integer id){
        Map<String,Object> map = new HashMap<>();
        if (service.del(id)){
            map.put("status",true);
        }else {
            map.put("status",false);
        }
        return map;
    }
}
