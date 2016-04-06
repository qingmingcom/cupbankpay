package com.datayp.cupbankpay.service;

import java.util.List;

import com.datayp.cupbankpay.bean.User;

public interface UserService {

    public User getValue(Integer id);

    public User getValueByNumber(String number);

    public List<User> getList();

    public int add(User user);

    public int modify(User user);

    public int remove(Integer id);

}
