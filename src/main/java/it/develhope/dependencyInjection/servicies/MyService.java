package it.develhope.dependencyInjection.servicies;

import it.develhope.dependencyInjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public String getName(){
        return myComponent.getMyComponentName();
    }
}
