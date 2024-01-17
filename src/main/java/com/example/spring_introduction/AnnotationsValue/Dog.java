package com.example.spring_introduction.AnnotationsValue;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.stereotype.Component;

import static java.lang.System.*;


@Component("myDoggie")
public class Dog implements Pet {
    public Dog() {
        out.println("Dog is created");
    }

    @Override
    public void say() {
        out.println("Bark");
    }

}
