package com.zlj.community.community.mapper.impl;


import com.zlj.community.community.mapper.AlphaDao;
import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoImpl implements AlphaDao {
    @Override
    public String selectOne() {
            return "select One Successfully";
    }
}
