package com.swiftbeard.didemo.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "hello - I was injected visa the constructor!!!";
    }
}
