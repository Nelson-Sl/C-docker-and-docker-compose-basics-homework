package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/alice")
public class AliceController {
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hello")
    public String hello() {
        String bobResourcesUrl = "http://localhost:8081/bob/hello";
        return restTemplate.getForObject(bobResourcesUrl, String.class);
    }
}
