package com.fenglingzmb.multisource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fenglingzmb.multisource.mapper.UserMapper;
import com.fenglingzmb.multisource.pojo.User;
import com.fenglingzmb.multisource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/5
 */
@DS("slave")
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @DS("master")
    public List<User> www() {
        return new ArrayList<User>();
    }
}
