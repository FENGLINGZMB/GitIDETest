package com.fenglingzmb.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fenglingzmb.mybatisx.pojo.Department;
import com.fenglingzmb.mybatisx.service.DepartmentService;
import com.fenglingzmb.mybatisx.mapper.DepartmentMapper;
import com.sun.org.apache.bcel.internal.generic.IFNE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 无极之维
 * @description 针对表【department】的数据库操作Service实现
 * @createDate 2022-03-05 05:57:35
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
        implements DepartmentService {
    public void we() {
        int iwww = 10;
        System.out.println(iwww);
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        DepartmentServiceImpl.qewcq();
        List<String> strings = new ArrayList<>();

    }

    public static void qewcq() {

    }

}