package com.example.spring_introduction.Autowired.AutowiredPole;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static java.lang.System.out;


@Component("personBeanPole")
@SuppressWarnings("all")
public class PersonPole {
    @Autowired
    @Qualifier("catBeanPole")
    private Pet pet;

    protected void callYourPet() {
        out.println("Hello, my pet");
        pet.say();
    }

    public PersonPole() {
        out.println("Class Person is created");
    }


    public Pet getPet() {
        return pet;
    }


    public void setPet(@Qualifier("dogBeanPole") Pet pet) {
        out.println("Class Person: set pet");
        this.pet = pet;
    }

}
