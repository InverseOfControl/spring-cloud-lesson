package com.gaohx.springcloudlesson4eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${prod.name}")
    private String prodName;

    @GetMapping("/getMsg")
    public String getMsg(){
        return prodName;
    }
}
