package com.hw0904.service.impl;

import com.hw0904.mapper.WorkerDao;
import com.hw0904.pojo.Worker;
import com.hw0904.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerDao wd;

    @Override
    public List<Worker> getAllWorkers() {
        return wd.getAllWorkers();
    }

    @Override
    public int addWorker(Worker worker) {
        Worker w=wd.selectById(worker.getWid());
        if(w==null){
            return wd.insert(worker);
        }else{
            return 0;
        }
    }

    @Override
    public int delWorker(int wid) {
        return wd.deleteById(wid);
    }

    @Override
    public int updateWorker(Worker worker) {
        return wd.updateById(worker);
    }

    @Override
    public Worker getone(int wid) {
        return wd.selectById(wid);
    }
}
