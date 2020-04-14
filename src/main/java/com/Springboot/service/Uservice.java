package com.Springboot.service;

import com.Springboot.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
public class Uservice {


    //查询
    public User queryUser(long id){
        return new User();
    }
    //保存
    @Transactional
    public void saveUser(User user){
        System.out.println("保存成功!");
    }
}

