package com.ly.Service;

import com.ly.Dao.dao;
import com.ly.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    private dao d;


    public List<Users> showUsers(String username, String password) {
        List<Users> usersList = d.getUsersList();
        return usersList;
    }

    public void register(String username, String password) {
        d.insertUsers(username,password);
    }
}
