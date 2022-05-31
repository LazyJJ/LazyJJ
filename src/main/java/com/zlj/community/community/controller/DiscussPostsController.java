package com.zlj.community.community.controller;


import com.zlj.community.community.entity.DiscussPost;
import com.zlj.community.community.entity.Page;
import com.zlj.community.community.service.DiscussPostService;
import com.zlj.community.community.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DiscussPostsController {

    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String  getIndexPage(Model model , Page page){
        page.setRows(discussPostService.findDiscussPostsRows(0));
        page.setPath("/index");


        List<DiscussPost> discussPostList = discussPostService.findDiscussPosts(0,page.getOffset(),page.getLimit());
        List<Map<String,Object>> mapList = new ArrayList<>();
        for (DiscussPost discussPost : discussPostList) {
            Map<String ,Object> map = new HashMap<>();
            map.put("post",discussPost);
            map.put("user",userService.findUserById(discussPost.getUserId()));
            mapList.add(map);
        }
        model.addAttribute("discussPosts",mapList);

        return "/index";
    }

}
