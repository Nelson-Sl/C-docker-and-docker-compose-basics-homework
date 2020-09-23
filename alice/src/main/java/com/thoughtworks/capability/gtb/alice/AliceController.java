package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hello")
    public String hello() {
        //备注：Windows下不可以直接映射，只能对照docker-machine ip设计
        String bobResourcesUrl = "http://192.168.99.100:8081/hello";
        return restTemplate.getForObject(bobResourcesUrl, String.class);
    }
}
