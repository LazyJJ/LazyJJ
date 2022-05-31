package com.zlj.community.community.mapper;

import com.zlj.community.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(Integer userId,int offset, int limit);

    Integer selectDiscussPostsRows(@Param("userId") Integer userId);

}
