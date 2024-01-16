package com.example.spring_introduction.Bean;

import static java.lang.System.*;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        out.println("Class Person: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        out.println("Class Person: set pet");
        this.pet = pet;
    }

    public Person() {
        out.println("Person bean is created");
    }
    protected void callYourPet() {
        out.println("Hello, my pet");
        pet.say();
    }
}
