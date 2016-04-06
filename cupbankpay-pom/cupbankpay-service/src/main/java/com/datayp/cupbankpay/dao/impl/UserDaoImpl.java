package com.datayp.cupbankpay.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.datayp.cupbankpay.bean.User;
import com.datayp.cupbankpay.dao.UserDao;

@Repository("userDao2222")
// public class UserDaoImpl implements UserDao {
public class UserDaoImpl {

    @Resource
    private SqlSession sqlSession;

    public User getValue(Integer id) {
        User user = sqlSession.selectOne("com.datayp.cupbankpay.dao.UserDao.getValue", id);
        return user;
    }

    public User getValue2222(Integer id) {
        // bridge to auto generated dao impl
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getValue(id);
        return user;
    }

}
