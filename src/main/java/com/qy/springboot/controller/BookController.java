package com.qy.springboot.controller;

import com.qy.springboot.MyDatesource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping("/save")
    public String save() {
        System.out.println("springboot running");
        return "springboot running";
    }
    @Autowired
    private MyDatesource myDatesource;
    @GetMapping("/myDatesource")
    private String ByID() {
        System.out.println(myDatesource);
        return  "Springboot";
    }
}
