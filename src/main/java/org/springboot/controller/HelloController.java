package org.springboot.controller;

import org.springboot.entity.User;
import org.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

        return "index";
    }

    @Autowired
    private UserService userSevrvice;

    @RequestMapping(value = "/query/{id}",method = RequestMethod.POST)
    @ResponseBody
    public List<User> queryUser(@PathVariable("id") int id){
        List<User> userList = this.userSevrvice.queryUser(id);
        return userList;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public boolean insertUser(@RequestBody User user){
        boolean result = this.userSevrvice.insertUsert(user);
        return result;
    }
}
