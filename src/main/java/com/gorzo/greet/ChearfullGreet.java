package com.gorzo.greet;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ChearfullGreet implements GreetingInterface {

    @Override
    public String getGreet() {
        return "YooooHoooo you again :)";
    }
}

