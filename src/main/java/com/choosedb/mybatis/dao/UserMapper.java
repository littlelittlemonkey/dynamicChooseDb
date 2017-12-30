package com.choosedb.mybatis.dao;

import com.choosedb.mybatis.model.User;

public interface UserMapper {

    //访问读数据库
    User selectUserById(int id);

    //访问写数据库
    int addUser(User user);

}
