package com.example.circuitbreaker.controller;

import com.example.circuitbreaker.service.BreakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableCircuitBreaker
@RestController
public class BreakerController {
    /**
     * Use @EnableCircuitBreaker annotation
     * http://localhost:8080/callBreaker
     */
    @Autowired
    private BreakerService breakService;

    @RequestMapping("/callBreaker")
    public String callBreaker(){
        return breakService.runningMethod();
    }
}
