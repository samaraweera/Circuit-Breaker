package com.example.circuitbreaker.servicecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    /**
     * This is Service controller. You can create this as separate project.
     * This project up with 9080 port
     * http://localhost:9080/booter
     */

    @GetMapping("/booter")
    public String booterOne(){
        return "Circuit breaker service";
    }
}