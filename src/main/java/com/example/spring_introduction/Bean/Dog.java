package com.example.spring_introduction.Bean;

import static java.lang.System.*;

class Dog implements Pet {

    public Dog() {
        out.println("Dog bean is created");
    }

    @Override
    public void say() {
        out.println("bark");
    }
}
