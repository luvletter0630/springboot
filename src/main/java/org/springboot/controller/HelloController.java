package org.springboot.controller;

import org.springboot.entity.User;
import org.springboot.service.UserSevrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 76164 on 2017/10/18.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("msg", "SpringBoot Ajax 示例");

        return "index1";
    }

    @Autowired
    private UserSevrvice userSevrvice;

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    @ResponseBody
    public List<User> queryUser(){
        List<User> userList = this.userSevrvice.queryUser();
        return userList;
    }

}
