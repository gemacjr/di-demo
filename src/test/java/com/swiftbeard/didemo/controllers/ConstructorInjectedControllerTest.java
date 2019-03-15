package com.swiftbeard.didemo.controllers;

import com.swiftbeard.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructedInjectedController constructedInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructedInjectedController = new ConstructedInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructedInjectedController.sayHello());
    }

}
