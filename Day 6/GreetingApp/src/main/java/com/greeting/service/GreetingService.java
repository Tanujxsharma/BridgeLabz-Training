package com.greeting.service;

import com.greeting.model.Greeting;
import com.greeting.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting createGreeting(Greeting greeting) {

        return greetingRepository.save(greeting);
    }
    public List<Greeting> getAllGreetings(){
        return greetingRepository.findAll();
    }
    public Greeting getGreetingById(int id) {

        return greetingRepository.findById(id);
    }

    public boolean deleteGreeting(int id) {

        return greetingRepository.delete(id);
    }
}
