package com.choosedb.controller;

import com.choosedb.mybatis.model.User;
import com.choosedb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 *
 */
@Controller
@RequestMapping(value = "/user", produces = {"application/json;charset=UTF-8"})
public class UserController {

    @Autowired
    private IUserService userService;

    //http://localhost:8080/user/select.do
    @ResponseBody
    @RequestMapping(value = "/select.do", method = RequestMethod.GET)
    public String select() {
        User user = userService.selectUserById(123);
        return user.toString();
    }

    //http://localhost:8080/user/add.do
    @ResponseBody
    @RequestMapping(value = "/add.do", method = RequestMethod.GET)
    public String add() {
        boolean isOk = userService.addUser(new User("333", "444"));
        return isOk == true ? "shibai" : "chenggong";
    }
}
