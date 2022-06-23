package com.mask.auth.controller;

import com.mask.auth.service.UserService;
import com.mask.common.model.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mask
 * @since 2022/6/19 10:46
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/test")
    public ResultMsg test() {
        return userService.test();
    }



}
