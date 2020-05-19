package com.lk.service;

import com.lk.bean.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    List<User> getUserByName(String name);

    boolean addUser(User user);

    boolean deleteUser(int uid);

    boolean updateUser(User user);

    User getById(Integer uid);
}
