package helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "hello";
    }
}
