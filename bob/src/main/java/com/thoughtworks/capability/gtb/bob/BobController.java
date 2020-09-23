package com.thoughtworks.capability.gtb.bob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bob")
public class BobController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Bob!";
    }
}