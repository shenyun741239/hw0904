package com.hw0904.controller;

import com.hw0904.pojo.Worker;
import com.hw0904.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sun.plugin2.message.GetNameSpaceMessage;

import java.util.List;

@Controller
public class MyController1 {
    @Autowired
    private WorkerService ws;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/main")
    public String show(String uname, String upwd, Model model){
//        if(uname=="addmin" && upwd=="123"){
            List<Worker> list =ws.getAllWorkers();
            model.addAttribute("info",list);
            return "zhuye";
//        }else{
//            return "false";
//        }
    }
    @GetMapping("/zhuce")
    public String zhuce(){
        return "adduser";
    }
}
