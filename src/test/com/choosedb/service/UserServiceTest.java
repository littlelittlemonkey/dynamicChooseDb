package com.choosedb.service;

import com.choosedb.mybatis.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:root.xml")
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void selectUserById() throws Exception {
        User user = userService.selectUserById(2);
        System.out.println(user);
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setName("Jhonner");
        user.setPassword("Jhonner");
        userService.addUser(user);
    }

}