package com.example.spring_introduction.Autowired.AutowiredOther;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.stereotype.Component;

import static java.lang.System.*;

@Component("dogBean")
public class Dog implements Pet {
    public Dog() {
        out.println("Dog bean is created");
    }
    @Override
    public void say() {
        out.println("Bark");
    }
}
