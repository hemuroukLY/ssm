package com.ly.Dao;

import com.ly.Entity.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface dao {
    @Select("select * from users")
    List<Users> getUsersList();

    @Insert("insert into users(username, password) values (#{username},#{password})")
    void insertUsers(@Param("username") String username, @Param("password") String password);
}
