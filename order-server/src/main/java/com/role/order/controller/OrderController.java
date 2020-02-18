package com.role.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/order")
@RestController
public class OrderController {
    // 这里配置的是我们要调用的服务实例名，我们要调用USER服务，因此这里的地址是USER
    private String rest_url_prefix = "http://user-server";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/home")
    public String home() {
        return "order home hello";
    }

    @RequestMapping("/index")
    public String index() {
        return "order index hello";
    }

    @GetMapping("/{id}")
    public String getRole(@PathVariable("id") String id) {
        System.out.println("接收到请求[/order/" + id + "]");

        // 调用USER服务中的/users/{id}服务
        return restTemplate.getForObject(rest_url_prefix + "/user/" + id, String.class);
    }

}
