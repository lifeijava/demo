package com.rock.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/home")
    public static String home() {
        return "home hello";
    }
    @RequestMapping("/index")
    public static String index() {
        return "index hello";
    }
}
