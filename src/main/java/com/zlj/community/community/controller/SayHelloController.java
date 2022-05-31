package com.zlj.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sayHello")
public class SayHelloController {

    @RequestMapping("/zlj")
    @ResponseBody
    public String sayZlj(){
        return "Hello ZLJ";
    }

    @RequestMapping("/git")
    @ResponseBody
    public String sayGit(){
        return "Git Exists And Working";
    }

}
