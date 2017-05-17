package com.codeworks;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author autowired
 *         Date    5/17/17
 */
@RestController
@RequestMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {
    @GetMapping
    public String sayHello(){
        return "Hello Venon!";
    }
}
