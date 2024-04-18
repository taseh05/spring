package tahaseen.learning.springioc.demo;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public String getEngineData() {
        return "I am engine class";
    }
}
