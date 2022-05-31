package com.zlj.community.community.service;

import com.zlj.community.community.entity.DiscussPost;
import com.zlj.community.community.mapper.DiscussPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(Integer id,int offset, int limit){
        return discussPostMapper.selectDiscussPosts(id,offset,limit);
    }

    public Integer findDiscussPostsRows(Integer id){
        return discussPostMapper.selectDiscussPostsRows(id);
    }

}
