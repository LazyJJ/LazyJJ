package com.zlj.community.community.mappertest;

import com.zlj.community.community.CommunityApplication;
import com.zlj.community.community.entity.User;
import com.zlj.community.community.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectById(){
        System.out.println("/*-/*-/*-/*-/*-/*-/*-/*-/*-/**-/*-/*-");
        System.out.println(userMapper.selectById(1));
        System.out.println("/*-/*-/*-/*-/*-/*-/*-/*-/*-/**-/*-/*-");
    }

    @Test
    public void testSelectByNameEmail(){
        System.out.println("/*-/*-/*-/*-/*-/*-/*-/*-/*-/**-/*-/*-");

        System.out.println(userMapper.selectByUsername("iii"));
        System.out.println(userMapper.selectByEmail("nowcoder131@sina.com"));
        System.out.println(userMapper.selectByEmail("zhanglvji@163.com"));

        System.out.println("/*-/*-/*-/*-/*-/*-/*-/*-/*-/**-/*-/*-");
    }

    @Test
    public void testSelectAllUsers(){
        System.out.println(userMapper.selectAllUsers().size());
    }

    @Test
    public void testSelectEligibleUsers(){
        List<User> list = userMapper.selectEligibleUsers(new User().setType(2).setId(21).setUsername("jjj"));
        for(User user : list){
            System.out.println(user);
        }
        System.out.println("/*-------*/-/-/-/*/-/*-");
        System.out.println(userMapper.selectEligibleUsers(new User()).size());
    }

    @Test
    public void testInsertUser(){
        System.out.println(userMapper.insertUser(new User().setUsername("zhanglvji").setPassword("000000")
        .setType(1).setEmail("zhanglvji@163.com").setSalt("1")
        ));
    }

    @Test
    public void testUpdate(){
        userMapper.updateStatus(150,0);
        userMapper.updateHeader(150,"https://image.baidu.com");
        userMapper.updatePassword(150,"111111");

        System.out.println(userMapper.selectById(150));
    }


}
