package org.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.springboot.entity.User;

import java.util.List;

/**
 * Created by 76164 on 2017/10/18.
 */
public interface UserDao {
    public List<User> queryUser(@Param("id") int id);

    public boolean insertUser(User user);
}
