package com.example.spring_introduction.AnnotationsXML;

import com.example.spring_introduction.Bean.Pet;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static java.lang.System.*;

@Scope("prototype")
@Component("myNewDoggie")
public class Dog implements Pet {
    @Override
    public void say() {
        out.println("Bark");
    }

    public Dog() {
        out.println("Dog bean is created");
    }

    @PostConstruct
    public void init() {
        out.println("Class Dog: init method");
    }

    @PreDestroy
    public void destrouy() {
        out.println("Class dog: destroy method");
    }
}
