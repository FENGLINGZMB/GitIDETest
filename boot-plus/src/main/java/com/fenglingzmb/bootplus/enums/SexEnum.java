package com.fenglingzmb.bootplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/4
 */
@Getter
public enum SexEnum {
    MALE(1, "男"),
    FEMALE(2, "女");

    @EnumValue
    private final int code;
    private final String description;

    SexEnum(int val, String description) {
        this.code = val;
        this.description = description;
    }
}
