package com.zlj.community.community.mapper;

import com.zlj.community.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectById(Integer id);

    User selectByUsername(String username);

    User selectByEmail(String email);

    List<User> selectAllUsers();

    List<User> selectEligibleUsers(User user);

    Integer insertUser(User user);

    Integer updateStatus(Integer id,Integer status);

    Integer updateHeader(Integer id, String headerUrl);

    Integer updatePassword(Integer id,String password);
}
