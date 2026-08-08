package com.greeting.repository;

import com.greeting.model.Greeting;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class GreetingRepository {

    private final List<Greeting> greetings = new ArrayList<>();

    private int idCounter = 1;

    public Greeting save(Greeting greeting) {

        greeting.setId(idCounter++);

        greetings.add(greeting);

        return greeting;
    }

    public List<Greeting> findAll() {

        return greetings;
    }

    public Greeting findById(int id) {

        return greetings.stream()
                .filter(greeting -> greeting.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean delete(int id) {

        return greetings.removeIf(
                greeting -> greeting.getId() == id
        );
    }
}
