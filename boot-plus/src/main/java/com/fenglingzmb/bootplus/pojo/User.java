package com.fenglingzmb.bootplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fenglingzmb.bootplus.enums.SexEnum;
import lombok.Data;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/3
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private SexEnum sex;
}
