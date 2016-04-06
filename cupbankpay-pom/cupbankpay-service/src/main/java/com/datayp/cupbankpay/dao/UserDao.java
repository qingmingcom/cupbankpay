package com.datayp.cupbankpay.dao;

import java.util.List;

import com.datayp.cupbankpay.bean.User;

public interface UserDao {

    public User getValue(Integer id);

    public User getValueByNumber(String number);

    public List<User> getList();

    public int insert(User user);

    public int update(User user);

    public int delete(Integer id);

}
