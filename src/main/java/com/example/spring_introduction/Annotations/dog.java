package com.example.spring_introduction.Annotations;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static java.lang.System.out;


@Component
@Scope("prototype")
public class dog implements Pet {
    public dog() {
        out.println("dog bean is created");
    }

    @Override
    public void say() {
        out.println("bark");
    }
}
