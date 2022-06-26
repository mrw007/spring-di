package mrw007.springframework.springdi.controllers;


import mrw007.springframework.springdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}
