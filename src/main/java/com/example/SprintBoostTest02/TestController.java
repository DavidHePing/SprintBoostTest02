package com.example.SprintBoostTest02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @ResponseBody
    @GetMapping(value = "/test")
    public String testGet(){
        return "Hello World";
    }
}
