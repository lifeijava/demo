package com.rock.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/http")
@RestController
public class HttpController {


    @Value(value = "${httpUrl}")
    private String httpUrl;

    @RequestMapping("/getHttpUrl")
    public String getHttpUrl(){
        return httpUrl;
    }
}
