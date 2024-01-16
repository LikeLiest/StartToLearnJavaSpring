package com.example.spring_introduction.Bean;

import static java.lang.System.*;

public class Cat implements Pet{
    public Cat() {
        out.println("Cat bean is created");
    }

    @Override
    public void say() {
        out.println("Meow meow");
    }
}
