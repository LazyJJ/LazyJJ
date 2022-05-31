package com.zlj.community.community.mappertest;

import com.zlj.community.community.CommunityApplication;
import com.zlj.community.community.entity.DiscussPost;
import com.zlj.community.community.mapper.DiscussPostMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class DiscussPostMapperTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testDiscussPostMapper(){
        for (DiscussPost discussPost : discussPostMapper.selectDiscussPosts(0, 0, 5)) {
            System.out.println(discussPost);
        }
        System.out.println("截断截断截断截断截断截断截断截断截断截断截断截断截断截断截断");
        System.out.println(discussPostMapper.selectDiscussPostsRows(0));

    }
}
