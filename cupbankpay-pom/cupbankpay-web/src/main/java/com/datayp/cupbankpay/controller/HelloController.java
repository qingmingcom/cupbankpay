package com.datayp.cupbankpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/helloworld", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String helloworld() {
        return "<html><head><title>Hello, world.</title></head><body>Hello, world!</body></html>";
    }

    @RequestMapping(value = "/helloworld2", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String helloworld2() {
        return "{id:1, number:'0001', name:'张三'}";
    }

    @RequestMapping(value = "/sayhello", produces = "application/json; charset=UTF-8")
    @ResponseBody()
    public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "duke") String name) {
        return "Hello, " + name;
    }

}
