package com.client.eurekaClient.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello1")
    public String hello() throws InterruptedException {
        //Thread.sleep(5000);
        return "Response from eureka client 2";
    }
}
