package org.springboot.service.impl;

import org.springboot.dao.UserDao;
import org.springboot.entity.User;
import org.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 76164 on 2017/10/18.
 */

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    /**
     * 查询用户信息
     */
    @Override
    public List<User> queryUser(int id) {
        return userDao.queryUser(id);
    }

    @Override
    public boolean insertUsert(User user) {
        return userDao.insertUser(user);
    }
}
