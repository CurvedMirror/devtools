package com.example.devtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jie
 * @date 2019/3/16 0016 -10:21
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(String name){
        return name;
    }
}
