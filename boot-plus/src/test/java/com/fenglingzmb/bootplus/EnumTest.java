package com.fenglingzmb.bootplus;

import com.fenglingzmb.bootplus.enums.SexEnum;
import com.fenglingzmb.bootplus.mapper.UserMapper;
import com.fenglingzmb.bootplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/4
 */
@SpringBootTest
public class EnumTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testEnumInsert(){
        User user = new User();
        user.setName("name");
        user.setAge(22);
        user.setEmail("ewwec");
        user.setSex(SexEnum.MALE);
        userMapper.insert(user);
    }

    @Test
    public void testEnumGet() {
        User user = userMapper.selectById(1499709600461545473L);
        System.out.println(user);
    }
}
