package com.example.spring_introduction.BeanScope;

import com.example.spring_introduction.Bean.Pet;

import static java.lang.System.out;

class Dog implements Pet {

    public Dog() {
        out.println("Dog bean is created");
    }

    @Override
    public void say() {
        out.println("bark");
    }
}
