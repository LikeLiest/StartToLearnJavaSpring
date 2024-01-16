package com.example.spring_introduction.Init_Destroy_Methods;

import com.example.spring_introduction.Bean.Pet;

import static java.lang.System.*;

public class Cat implements Pet {
    @Override
    public void say() {
        out.println("Meow meow");
    }

    public Cat() {
        out.println("Cat bean is created");
    }



//    Можно написать return-type, но их нельзя будет использовать :)
//    Параметров быть не должно !
    private void init() {
        out.println("Class Cat: init method");
    }

    private void destroy() {
        out.println("Class Cat: destroy method");
    }
}
