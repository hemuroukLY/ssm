package com.ly.Controller;

import com.ly.Entity.Users;
import com.ly.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/Login")
    public Integer login(@RequestBody Users user){
        List<Users> usersList=loginService.showUsers();
        for (Users users : usersList) {
            if(user.getUsername().equals(users.getUsername())){
                if(user.getPassword().equals(users.getPassword())){
                    return 1;
                }else {
                    return 2;
                }
            }
        }
        return 0;
    }
}
