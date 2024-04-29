package com.ly.Service;

import com.ly.Entity.Users;

import java.util.List;

public interface RegisterService {
    List<Users> showUsers(String username, String password);

    void register(String username,String password);
}
