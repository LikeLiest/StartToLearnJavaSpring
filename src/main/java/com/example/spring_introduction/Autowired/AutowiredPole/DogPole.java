package com.example.spring_introduction.Autowired.AutowiredPole;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component("dogBeanPole")
public class DogPole implements Pet {
    public DogPole() {
        out.println("Dog bean is created");
    }
    @Override
    public void say() {
        out.println("Bark");
    }
}
