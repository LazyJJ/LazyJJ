package com.zlj.community.community.service;


import com.zlj.community.community.mapper.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AlphaService {

    @Autowired
    @Qualifier(value = "alphaDaoImpl")
    private AlphaDao alphaDao;

    public String getAlpha(){
        return alphaDao.selectOne();
    }

}
