package com.fenglingzmb.mybatisx.mapper;

import com.fenglingzmb.mybatisx.pojo.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 无极之维
* @description 针对表【department】的数据库操作Mapper
* @createDate 2022-03-05 05:57:35
* @Entity com.fenglingzmb.mybatisx.pojo.Department
*/
public interface DepartmentMapper extends BaseMapper<Department> {
    int insertSelective(Department department);
}




