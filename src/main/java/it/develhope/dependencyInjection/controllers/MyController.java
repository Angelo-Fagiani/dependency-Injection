package it.develhope.dependencyInjection.controllers;

import it.develhope.dependencyInjection.servicies.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//il RestController è un Component
@RequestMapping
public class MyController {
    private MyService service;

    public MyController(MyService service) {
        System.out.println(" MyService.getName() has been called");
        this.service = service;
    }
    @GetMapping
    public String welcomeMessage(){
        return "Welcome Message!";
    }

    @GetMapping(value = "/getName")
    public String getName(){
        return service.getName();
    }

}
