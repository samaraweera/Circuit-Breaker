package com.example.circuitbreaker.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class BreakerService {

    /**
     * Call "http://localhost:9080/booter service here.
     */
    @HystrixCommand(fallbackMethod = "reliable")
    public  String runningMethod(){
        RestTemplate rt = new RestTemplate();
        URI uri = URI.create("http://localhost:9080/booter");
        return rt.getForObject(uri, String.class);
    }

    /**
     *  If there is issue with "http://localhost:9080/booter API then call reliable()
     */
    public  String reliable(){
        return "Cloud Native Java (O'Reilly)";
    }


}
