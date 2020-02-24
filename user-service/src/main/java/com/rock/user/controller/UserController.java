package com.rock.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/home")
    public static String home() {
        return "user home hello";
    }
    @RequestMapping("/index")
    public static String index() {
        return "user index hello";
    }
    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String id) {
        System.out.println("接收到请求[/user/" + id + "]");
        return "testUser:"+port;
    }
    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public String hello(HttpServletRequest request){

        return "hello, "
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ", extendtag ["
                + request.getHeader("extendtag")
                + "]";
    }
}
