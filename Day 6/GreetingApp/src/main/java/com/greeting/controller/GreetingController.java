package com.greeting.controller;

import com.greeting.model.Greeting;
import com.greeting.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private final GreetingService greetingService;
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    @PostMapping
    public Greeting createGreeting(
            @RequestBody Greeting greeting) {

        return greetingService.createGreeting(greeting);
    }
    @GetMapping
    public List<Greeting> getAllGreetings() {

        return greetingService.getAllGreetings();
    }

}
