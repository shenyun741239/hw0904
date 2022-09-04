package com.hw0904.service;

import com.hw0904.pojo.Worker;

import java.util.List;

public interface WorkerService {
    //查全部
    public List<Worker> getAllWorkers();
    //增
    public int addWorker(Worker worker);
    //删
    public int delWorker(int wid);
    //改
    public int updateWorker(Worker worker);
    //查一条
    public Worker getone(int wid);
}
