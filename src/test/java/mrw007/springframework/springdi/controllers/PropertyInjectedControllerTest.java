package mrw007.springframework.springdi.controllers;

import mrw007.springframework.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl() ;
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}