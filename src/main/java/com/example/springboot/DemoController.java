package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String index() {
        return "Great Demo: BLUE";
    }

}
