package com.hw0904.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hw0904.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentDao extends BaseMapper<Department> {
}
