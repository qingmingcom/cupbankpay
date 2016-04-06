package com.datayp.cupbankpay.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datayp.cupbankpay.bean.User;
import com.datayp.cupbankpay.dao.UserDao;
import com.datayp.cupbankpay.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    // @Autowired
    @Resource
    private UserDao userDao;

    public User getValue(Integer id) {
        User user = userDao.getValue(id);
        return user;
    }

    public User getValueByNumber(String number) {
        User user = userDao.getValueByNumber(number);
        return user;
    }

    public List<User> getList() {
        List<User> userList = userDao.getList();
        return userList;
    }

    public int add(User user) {
        int cnt = userDao.insert(user);
        return cnt;
    }

    @Override
    public int modify(User user) {
        int cnt = userDao.update(user);
        return cnt;
    }

    @Override
    public int remove(Integer id) {
        int cnt = userDao.delete(id);
        return cnt;
    }

}
