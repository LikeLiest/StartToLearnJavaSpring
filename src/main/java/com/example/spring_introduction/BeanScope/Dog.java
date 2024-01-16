package com.example.spring_introduction.BeanScope;

import com.example.spring_introduction.Bean.Pet;

import static java.lang.System.out;

class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Dog() {
        out.println("Dog bean is created");
    }

    @Override
    public void say() {
        out.println("bark");
    }
}
