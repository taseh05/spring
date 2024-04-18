package tahaseen.learning.springioc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Car {
    @Autowired
    private Engine engine;

    public String getEngineData(){
        return engine.getEngineData();
    }
}
