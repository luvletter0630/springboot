package org.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springboot.entity.User;

import java.util.List;

/**
 * Created by 76164 on 2017/10/18.
 */
@Mapper
public interface UserDao {
    @Select("select * from User")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "age", column = "age"),
            @Result(property = "role", column = "role")
    })
    public List<User> queryUser();
}
