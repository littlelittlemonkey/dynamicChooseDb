package com.choosedb.service;

import com.choosedb.mybatis.model.User;
import com.choosedb.mybatis.dao.UserMapper;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 */
@Named
public class UserService implements IUserService {

    @Inject
    private UserMapper userMapper;

    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

    public boolean addUser(User user) {
        return userMapper.addUser(user) == 1 ? true : false;
    }
}
