package com.zlj.community.community.entitytest;

import com.zlj.community.community.CommunityApplication;
import com.zlj.community.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserTest {

    @Test
    public void testChainSetter(){
        User user = new User();
        user.setUsername("zhanglvji").setId(1).setPassword("0000000");
        System.out.println(user);

    }

}
