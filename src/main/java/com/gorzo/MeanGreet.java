package com.gorzo;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;

@ApplicationScoped
public class MeanGreet implements GreetingInterface{

    String greet = "Ugh you again!";

    @Override
    public String getGreet() {
        return greet;
    }
}
