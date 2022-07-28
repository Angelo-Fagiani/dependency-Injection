package it.develhope.dependencyInjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final String myComponentName;

    public MyComponent() {
        this.myComponentName = "Angelo Fagiani";
    }

    public String getMyComponentName(){
            return myComponentName;


        }
    }

