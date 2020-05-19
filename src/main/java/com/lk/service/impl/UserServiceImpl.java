package com.lk.service.impl;

import com.lk.bean.User;
import com.lk.bean.UserExample;
import com.lk.dao.UserMapper;
import com.lk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;



    @Override
    public List<User> getAll() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        userExample.clear();
        criteria.andUidIsNotNull();
        List<User> userList = userMapper.selectByExample(userExample);
        System.out.println(userList);
        return userList;
    }

    @Override
    public List<User> getUserByName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andStunameLike("%"+name+"%");
        List<User> userList = userMapper.selectByExample(userExample);
        System.out.println(userList);
        return userList;
    }

    @Override
    public boolean addUser(User user) {
        int i = userMapper.insertSelective(user);
        return  i >0  ? true :false;
    }

    @Override
    public boolean deleteUser(int uid) {
        int i = userMapper.deleteByPrimaryKey(uid);
        return i>0? true:false;
    }

    @Override
    public boolean updateUser(User user) {
        int i = userMapper.updateByPrimaryKey(user);
        return i>0? true :false;
    }

    @Override
    public User getById(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}

