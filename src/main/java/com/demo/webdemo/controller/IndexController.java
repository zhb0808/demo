package com.demo.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    //通过controller返回html界面
    @RequestMapping("/index")
    public  String indexJumpPage(){
        return "index";
    }

}
