package com.example.spring_introduction.Autowired;

import com.example.spring_introduction.Bean.Cat;
import com.example.spring_introduction.Bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static java.lang.System.*;


@Component("personBean")
@SuppressWarnings("all")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    protected void callYourPet() {
        out.println("Hello, my pet");
        pet.say();
    }

    public Person() {
        out.println("Class Person is created");
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        out.println("Person bean is created");
//        this.pet = pet;
//    }


    public Pet getPet() {
        return pet;
    }

    @Autowired
    public void setPet(@Qualifier("dogBean") Pet pet
//                       @Qualifier("catBean") Pet pet2
    ) {
        out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
