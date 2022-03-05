package com.fenglingzmb.multisource;

import com.fenglingzmb.multisource.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.fenglingzmb.multisource.mapper")
class MultisourceApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void testMultiSource() {
        userService.list();
    }

}
