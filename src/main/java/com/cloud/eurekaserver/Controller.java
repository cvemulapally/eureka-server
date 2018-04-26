package com.cloud.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/eureka/server")
public class Controller {

    @GetMapping
    public String hello(){
        return "Hello Eureka Server";
    }
}
