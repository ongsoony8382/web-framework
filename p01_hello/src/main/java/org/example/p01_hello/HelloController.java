package org.example.p01_hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "Hello World!";
    }

}
