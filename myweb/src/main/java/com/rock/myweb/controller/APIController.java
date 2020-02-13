package com.rock.myweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class APIController {
    @RequestMapping("/home")
    public static String home() {
        return "home";
    }
    @RequestMapping("/index")
    public static String index() {
        return "index hello";
    }
}
