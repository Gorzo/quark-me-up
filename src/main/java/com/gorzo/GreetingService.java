package com.gorzo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.Instant;

@ApplicationScoped
public class GreetingService {

    @Inject
    MeanGreet meanGreet;
    @Inject
    ChearfullGreet chearfullGreet;

    public String greet() {
        if(Instant.now().getEpochSecond()%2==0) {
            return generateGreeting(meanGreet);
        }
        return generateGreeting(chearfullGreet);
    }

    private String generateGreeting(GreetingInterface g1) {
        return g1.getGreet();
    }

}
