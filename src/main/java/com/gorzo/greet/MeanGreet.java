package com.gorzo.greet;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MeanGreet implements GreetingInterface {

    String greet = "Ugh you again!";

    @Override
    public String getGreet() {
        return greet;
    }
}
