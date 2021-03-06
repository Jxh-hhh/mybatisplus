package com.example.mybatisplus.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/console")
    public String console(){
        return "/views/home/console";
    }
    @RequestMapping("/")
    public String index(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(){
        return "index";
    }
    @RequestMapping("/batchList")
    public String batchList() {
        return "/pages/batch_list";
    }
    @RequestMapping("/productList")
    public String productList() {
        return "/pages/product_list";
    }
    @RequestMapping("/clothAdd")
    public String clothAdd(){
        return "/pages/cloth_add";
    }
    @RequestMapping("/auto")
    public String auto(){
        return "/views/component/table/auto";
    }
    @RequestMapping("/upload/demo1")
    public String upload(){
        return "/views/component/upload/demo1";
    }
}
