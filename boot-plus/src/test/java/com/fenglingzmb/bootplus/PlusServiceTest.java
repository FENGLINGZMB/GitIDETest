package com.fenglingzmb.bootplus;

import com.fenglingzmb.bootplus.pojo.User;
import com.fenglingzmb.bootplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/3
 */
@SpringBootTest
public class PlusServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testCount() {
        System.out.println(userService.count());
    }

    @Test
    public void testAdd() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            User user = new User();
            user.setName("name" + i);
            user.setAge(i + 20);
            user.setEmail("email" + i);
            users.add(user);
        }
        System.out.println(userService.saveBatch(users));
    }
}
