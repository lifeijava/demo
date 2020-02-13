package com.rock.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/home")
    public static String home() {
        return "home hello";
    }
    @RequestMapping("/index")
    public static String index() {
        return "index hello";
    }
}
