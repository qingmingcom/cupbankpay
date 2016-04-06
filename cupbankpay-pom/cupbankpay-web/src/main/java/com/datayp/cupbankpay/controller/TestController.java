package com.datayp.cupbankpay.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datayp.cupbankpay.bean.User;
import com.datayp.cupbankpay.dao.impl.UserDaoImpl;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private UserDaoImpl userDao2222;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        User user = userDao2222.getValue(1);
        System.out.println(user);

        user = userDao2222.getValue2222(1);
        System.out.println(user);
        return "success";
    }

}
