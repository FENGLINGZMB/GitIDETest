package com.fenglingzmb.bootplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.fenglingzmb.bootplus.mapper.UserMapper;
import com.fenglingzmb.bootplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/3
 */
@SpringBootTest
public class PlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectAll() {
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("wsws");
        user.setAge(23);
        user.setEmail("sertvbere4");
        System.out.println("line influenced: " + userMapper.insert(user));
        System.out.println("Id of new user: " + user.getId());
    }

    @Test
    public void testDelete() {
        List<Long> ids = Arrays.asList(1L, 2L, 3L, 4L);
        System.out.println("result: " + userMapper.deleteBatchIds(ids));
    }

    @Test
    public void testUpdate() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("name", "a").and(i -> i.gt("age", 22).isNotNull("email"));
        userMapper.selectList(wrapper);
    }

    @Test
    public void testSelect() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("age").orderByAsc("id");
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectPart() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("name", "age");
        userMapper.selectMaps(wrapper);
    }

    @Test
    public void testSubQuery() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.inSql("id", "select id from user");
        userMapper.selectList(wrapper);
    }

    @Test
    public void testUpdateWrapper() {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.set("age", 55).set("name", "newName").gt("age", 27);
        userMapper.update(null, wrapper);
    }

    @Test
    public void testReal() {
        String username = "a";
        Integer ageBegin = null;
        Integer ageEnd = 30;
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like(username != null, "name", username)
                .gt(ageBegin != null, "age", ageBegin)
                .lt(ageEnd != null, "age", ageEnd);
        userMapper.selectList(wrapper);
    }

    @Test
    public void testLambdaQueryWrapper(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.gt(User::getAge, 20).like(User::getName, "a");
        userMapper.selectList(wrapper);
    }

    @Test
    public void testLambdaUpdateWrapper(){
        LambdaUpdateWrapper<User> wrapper = new LambdaUpdateWrapper<>();
        wrapper.gt(User::getAge, 20).set(User::getName,"newNewName");
        userMapper.update(null,wrapper);
    }
}
