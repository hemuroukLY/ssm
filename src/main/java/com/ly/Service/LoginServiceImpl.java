package com.ly.Service;

import com.ly.Dao.dao;
import com.ly.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private dao d;


    public List<Users> showUsers() {
        List<Users> usersList = d.getUsersList();
        return usersList;
    }


}
