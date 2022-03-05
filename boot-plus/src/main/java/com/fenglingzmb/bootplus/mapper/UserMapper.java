package com.fenglingzmb.bootplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fenglingzmb.bootplus.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/3
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    Page<User> selectPageByAge(@Param("page") Page<User> page,@Param("age") Integer age);
}
