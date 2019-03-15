package com.swiftbeard.didemo.controllers;

import com.swiftbeard.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectedController {



    @Autowired
    @Qualifier("greetingServiceImpl")// override primary, try to comment out.
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
