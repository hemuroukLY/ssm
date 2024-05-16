package com.ly.Controller;

import com.ly.Entity.Users;
import com.ly.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/Register")
    public Integer register(@RequestBody Users user){
        List<Users> usersList=registerService.showUsers(user.getUsername(), user.getPassword());
        for (Users users : usersList) {
            if(user.getUsername().equals(users.getUsername())){
               return 0;
            }
        }
        registerService.register(user.getUsername(), user.getPassword());
        return 1;
    }
}
