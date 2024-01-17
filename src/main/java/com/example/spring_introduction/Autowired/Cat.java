package com.example.spring_introduction.Autowired;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.stereotype.Component;

import static java.lang.System.*;


@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        out.println("Cat bean is created");
    }

    @Override
    public void say() {
        out.println("Meow-meow");
    }
}
