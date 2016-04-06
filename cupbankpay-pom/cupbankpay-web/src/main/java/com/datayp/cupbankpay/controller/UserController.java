package com.datayp.cupbankpay.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.datayp.cupbankpay.bean.User;
import com.datayp.cupbankpay.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    // @Autowired
    @Resource
    private UserService userService;

    @RequestMapping("/view/{id}")
    public String getValueByPathId(@PathVariable Integer id, Model model) {
        return getValue(id, model);
    }

    @RequestMapping("/view")
    public String getValue(Integer id, Model model) {
        User user = userService.getValue(id);
        model.addAttribute("user", user);
        return "/user/view";
    }

    @RequestMapping("/view2")
    public String getValueByNumber(String number, Model model) {
        User user = userService.getValueByNumber(number);
        model.addAttribute("user", user);
        return "/user/view";
    }

    @RequestMapping("/list")
    public String getList(Model model) {
        List<User> userList = userService.getList();
        model.addAttribute("userList", userList);
        return "/user/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Integer id, Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "/user/add";
    }

    @RequestMapping("/add")
    public String add(User user, Model model) {
        int cnt = userService.add(user);
        List<User> userList = userService.getList();
        model.addAttribute("userList", userList);
        return "/user/list";
    }

    @RequestMapping("/toModify")
    public String toModify(Integer id, Model model) {
        User user = userService.getValue(id);
        model.addAttribute("user", user);
        return "/user/modify";
    }

    @RequestMapping("/modify")
    public String modify(User user, Model model) {
        int cnt = userService.modify(user);
        List<User> userList = userService.getList();
        model.addAttribute("userList", userList);
        return "/user/list";
    }

    @RequestMapping("/remove")
    public String remove(Integer id, Model model) {
        int cnt = userService.remove(id);
        List<User> userList = userService.getList();
        model.addAttribute("userList", userList);
        return "/user/list";
    }

}
