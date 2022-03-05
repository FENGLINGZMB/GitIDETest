package com.fenglingzmb.bootplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fenglingzmb.bootplus.mapper.UserMapper;
import com.fenglingzmb.bootplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/4
 */
@SpringBootTest
public class PluginTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPagination(){
        Page<User> page = new Page<>(5,5);
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.orderByDesc("age");
        userMapper.selectPage(page, null);
        System.out.println(page);
    }

    @Test
    public void testCustomizePagination() {
        Page<User> page = new Page<>(2,5);
        userMapper.selectPageByAge(page, 23);
    }

    @Test
    public void testOpmLock(){
        User user = userMapper.selectById(1);
        user.setAge(user.getAge() + 100);
        userMapper.updateById(user);
    }
}
