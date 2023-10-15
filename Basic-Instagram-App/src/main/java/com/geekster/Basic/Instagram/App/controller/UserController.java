package com.geekster.Basic.Instagram.App.controller;

import com.geekster.Basic.Instagram.App.model.User;
import com.geekster.Basic.Instagram.App.model.dto.SignInInputDto;
import com.geekster.Basic.Instagram.App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;



    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody User newUser) {
        return userService.userSignUp(newUser);
    }

    @PostMapping("user/signIn")
    public String userSignIn(@RequestBody SignInInputDto signInInput){
        return userService.userSignIn(signInInput);
    }


}
