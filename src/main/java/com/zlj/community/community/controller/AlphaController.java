package com.zlj.community.community.controller;


import com.zlj.community.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;

    @RequestMapping("/selectOne")
    @ResponseBody
    public String selectOne(){
        return alphaService.getAlpha();
    }

    //  /student?name=zlj&sid=2018102073
    @RequestMapping(path = "/student", method = RequestMethod.GET)
    @ResponseBody
    public String getStudent(@RequestParam(name = "name", required = false, defaultValue = "zlj")String name,
                             @RequestParam(name = "sid", required = false,defaultValue = "2018")String sid){
        System.out.println(name);
        System.out.println(sid);
        return "服务器已收到学生学号姓名";
    }

    //  以数据作路径  /path/2018
    @RequestMapping(path = "/path/{sid}",method = RequestMethod.GET)
    @ResponseBody
    public String getPath(@PathVariable("sid")String sid){
        System.out.println(sid);
        return "已拿到路径";
    }

    //POST传参
    @RequestMapping(path = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "zlj".equals(username)&&"123".equals(password)?"登录成功":"登录失败";
    }

    //响应HTML
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public ModelAndView getUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","寒冰射手");
        modelAndView.addObject("city","弗雷尔卓德");
        modelAndView.setViewName("/users");
        return modelAndView;
    }

    @RequestMapping(value = "/allUsers",method = RequestMethod.GET)
    public String getAllUsers(Model model){
        model.addAttribute("name","艾瑞利亚");
        model.addAttribute("city","艾欧尼亚");
        return "/users";
    }

    //响应JSON数据  会将对象，Map，List转为JSON格式
    @RequestMapping(path = "/city",method = RequestMethod.GET)
    @ResponseBody
    public Map<String ,Object> getCity(){
        Map<String,Object> map = new HashMap<>();
        map.put("省份","浙江");
        map.put("市区","台州");
        map.put("县城","天台");
        return map;
    }

}
