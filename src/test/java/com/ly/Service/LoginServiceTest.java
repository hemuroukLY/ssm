package com.ly.Service;

import com.ly.Entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;


public class LoginServiceTest {
    @Autowired
    private LoginService loginService;

    @Test
    public void showUsers() {
        List<Users> users = loginService.showUsers();
        System.out.println(users);
    }
}