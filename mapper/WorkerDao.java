package com.hw0904.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.hw0904.pojo.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkerDao extends BaseMapper<Worker> {
    public List<Worker> getAllWorkers();
}
