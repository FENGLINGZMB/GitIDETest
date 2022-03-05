package com.fenglingzmb.bootplus.controller;

import com.alibaba.fastjson.JSON;
import com.fenglingzmb.bootplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/3
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/u")
    public String getUser(){
        return JSON.toJSONString(userMapper.selectList(null));
    }
}
