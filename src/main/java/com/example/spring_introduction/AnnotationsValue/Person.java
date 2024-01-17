package com.example.spring_introduction.AnnotationsValue;

import com.example.spring_introduction.Bean.Pet;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import static java.lang.System.*;

@Component("personBean")
public class Person {
    private Pet pet;

    @Value("Ivanov")
    private String surname;

    @Value("100")
    private int age;

    @Autowired
    public Person(@Qualifier("myCatty") Pet pet) {
        out.println("Person is created");
        this.pet = pet;
    }

    public void callYourPet() {
        out.println("Peeeeeeeet");
        pet.say();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
