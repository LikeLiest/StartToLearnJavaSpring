package com.example.spring_introduction.AnnotationsValue;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.stereotype.Component;

import static java.lang.System.*;

@Component("myCatty")
public class Cat implements Pet {
    public Cat() {
        out.println("Cat is created");
    }

    @Override
    public void say() {
        out.println("Meow-meow");
    }
}
