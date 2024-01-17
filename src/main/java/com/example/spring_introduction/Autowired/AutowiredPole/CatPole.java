package com.example.spring_introduction.Autowired.AutowiredPole;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.stereotype.Component;

import static java.lang.System.out;


@Component("catBeanPole")
public class CatPole implements Pet {
    public CatPole() {
        out.println("Cat bean is created");
    }

    @Override
    public void say() {
        out.println("Meow-meow");
    }
}
