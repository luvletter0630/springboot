package org.springboot.service;


import org.springboot.entity.User;

import java.util.List;

/**
 * Created by 76164 on 2017/10/18.
 */
public interface UserService {
    public List<User> queryUser(int id);

    public boolean insertUsert(User user);
}
