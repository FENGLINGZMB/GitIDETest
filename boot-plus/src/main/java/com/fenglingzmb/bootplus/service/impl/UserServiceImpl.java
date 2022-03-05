package com.fenglingzmb.bootplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fenglingzmb.bootplus.mapper.UserMapper;
import com.fenglingzmb.bootplus.pojo.User;
import com.fenglingzmb.bootplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/3
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

}
